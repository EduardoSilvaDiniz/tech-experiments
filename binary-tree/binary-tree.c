#include "binary-tree.h"
#include <stdio.h>
#include <stdlib.h>

Node *createNode(int data) {
  Node *newNode = malloc(sizeof(Node));

  if (newNode == NULL)
    return NULL;

  newNode->data = data;
  newNode->right = NULL;
  newNode->left = NULL;

  return newNode;
}

void insert(int data, Node *curr) {
  if (data < 0 || curr == NULL)
    return;

  if (data > curr->data) {
    if (curr->right == NULL) {
      curr->right = createNode(data);
      curr->right->parent = curr;
      return;
    }

    insert(data, curr->right);
  } else if (data < curr->data) {
    if (curr->left == NULL) {
      curr->left = createNode(data);
      curr->left->parent = curr;
      return;
    }

    insert(data, curr->left);
  }
}

void inoderTreeWalk(Node *curr) {
  if (curr == NULL)
    return;

  inoderTreeWalk(curr->left);
  printf("%d ", curr->data);
  inoderTreeWalk(curr->right);
}
Node *search(int data, Node *curr) {
  if (curr == NULL || data == curr->data)
    return curr;

  if (data < curr->data)
    return search(data, curr->left);

  else
    return search(data, curr->right);
}

Node *delete(int data, Node *curr) {
  if (curr == NULL)
    return curr;
  else if (curr->data == data) {
    if (curr->left == NULL && curr->right == NULL) {
      free(curr);
      return NULL;
    }
  } else {
    if (data < curr->data)
      curr->left = delete (data, curr->left);
    else
      curr->right = delete (data, curr->right);
  }

  return curr;
}

Node *sucessor(Node *curr) {
  if (curr->right != NULL)
    return minimum(curr->right);
  Node *y = curr;
  while (y != NULL & curr == y->right) {
    curr = y;
    y = y->parent;
  }
  return y;
}

Node *maximum(Node *curr) {
  if (curr->right == NULL)
    return curr;

  return maximum(curr->right);
}

Node *minimum(Node *curr) {
  if (curr->left == NULL)
    return curr;

  return minimum(curr->left);
}

BinaryTree *constructor(int data) {
  BinaryTree *newTree = malloc(sizeof(BinaryTree));

  if (newTree == NULL)
    return NULL;

  newTree->root = createNode(data);
  newTree->search = &search;
  newTree->insert = &insert;
  newTree->delete = &delete;
  newTree->inorderTreeWalk = &inoderTreeWalk;

  return newTree;
}
