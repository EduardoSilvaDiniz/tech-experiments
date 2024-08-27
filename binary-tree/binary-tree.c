#include "binary-tree.h"
#include "inttypes.h"
#include "sys/types.h"
#include <stdio.h>
#include <stdlib.h>

typedef struct node {
  int value;
  struct node *right;
  struct node *left;
} Node;

Node *createNode(int value) {
  struct node *newNode = malloc(sizeof(struct node));
  if (newNode == NULL)
    return NULL;
  newNode->value = value;
  newNode->right = NULL;
  newNode->left = NULL;

  return newNode;
}

void searchFreeSpaceAndAddNode(Node *node, Node *head) {
  if (node == NULL || head == NULL)
    return;

  if (node->value > head->value) {
    if (head->right == NULL) {
      head->right = node;
      return;
    }

    searchFreeSpaceAndAddNode(node, head->right);
  } else if (node->value < head->value) {
    if (head->left == NULL) {
      head->left = node;
      return;
    }

    searchFreeSpaceAndAddNode(node, head->left);
  }
}

void showAllTrees(Node *head) {
  if (head == NULL)
    return;

  showAllTrees(head->left);
  printf("%d ", head->value);
  showAllTrees(head->right);
}
Node *searchNodeOnTree(Node *node, int value) {
  if (node == NULL)
    return NULL;
  else if (node->value == value) {
    printf("valor encontrando %d\n", node->value);
    return node;
  }

  searchNodeOnTree(node->left, value);
  searchNodeOnTree(node->right, value);
}

void removeNodeOnTree(Node *tree, int value) {
  Node *NodeToBeRemoved = searchNodeOnTree(tree, value);
  if (NodeToBeRemoved->left != NULL) {
    printf("left contem algo\n");
    NodeToBeRemoved->value = lastNodeExtremeRight(NodeToBeRemoved->left)->value;
  } else if (NodeToBeRemoved->right != NULL) {
    printf("right contem algo\n");
    NodeToBeRemoved->value = lastNodeExtremeLeft(NodeToBeRemoved->right)->value;
  } else {
    printf("achou nada\n");
    NodeToBeRemoved->value = 0;
  }
}

Node *lastNodeExtremeLeft(Node *node) {
  if (node->left == NULL) {
    printf("Extremo left contem :%d\n", node->value);
    return node;
  } else
    lastNodeExtremeLeft(node->left);
}

Node *lastNodeExtremeRight(Node *node) {
  if (node->right == NULL) {
    printf("Extremo right contem :%d\n", node->value);
    return node;
  } else
    lastNodeExtremeRight(node->right);
}
