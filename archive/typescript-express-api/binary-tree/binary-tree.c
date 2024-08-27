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

void add(int data, Node *curr) {
  if (data <= 0 || curr == NULL)
    return;

  if (data > curr->data) {
    if (curr->right == NULL) {
      curr->right = createNode(data);
      return;
    }

    add(data, curr->right);
  } else if (data < curr->data) {
    if (curr->left == NULL) {
      curr->left = createNode(data);
      return;
    }

    add(data, curr->left);
  }
}

void forEach(Node *curr) {
  if (curr == NULL)
    return;

  forEach(curr->left);
  printf("%d ", curr->data);
  forEach(curr->right);
}
void get(int data, Node *curr) {
  if (curr == NULL)
    return;
  else if (curr->data == data)
    printf("valor encontrando %d\n", curr->data);

  get(data, curr->right);
  get(data, curr->left);
  return;
}

void removeData(int data, Node *curr) {
  Node *NodeToBeRemoved = createNode(10);
  if (NodeToBeRemoved->left != NULL) {
    printf("left contem algo\n");
    NodeToBeRemoved->data = lastNodeExtremeRight(NodeToBeRemoved->left)->data;
  } else if (NodeToBeRemoved->right != NULL) {
    printf("right contem algo\n");
    NodeToBeRemoved->data = lastNodeExtremeLeft(NodeToBeRemoved->right)->data;
  } else {
    printf("achou nada\n");
    NodeToBeRemoved->data = 0;
  }
}

Node *lastNodeExtremeLeft(Node *curr) {
  if (curr->left == NULL) {
    printf("Extremo left contem :%d\n", curr->data);
    return curr;
  } else if (curr->left != NULL) {
    lastNodeExtremeLeft(curr->left);
  }
  return NULL;
}

Node *lastNodeExtremeRight(Node *curr) {
  if (curr->right == NULL) {
    printf("Extremo right contem :%d\n", curr->data);
    return curr;
  } else if (curr->right != NULL)
    lastNodeExtremeRight(curr->right);
  return NULL;
}

BinaryTree *constructor(int data) {
  BinaryTree *newTree = malloc(sizeof(BinaryTree));
  if (newTree == NULL)
    return NULL;
  newTree->base = createNode(data);
  newTree->add = &add;
  newTree->removeData = &removeData;
  newTree->forEach = &forEach;

  return newTree;
}
