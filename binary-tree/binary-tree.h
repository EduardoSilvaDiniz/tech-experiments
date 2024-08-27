#ifndef BINARY_TREE_H
#define BINARY_TREE_H

typedef struct binarytree {
  struct node *base;
  void (*add)(int data, struct node *curr);
  void (*get)(int value, struct node *curr);
  void (*removeData)(int value, struct node *curr);
  void (*forEach)(struct node *curr);
} BinaryTree;

typedef struct node {
  int data;
  struct node *right;
  struct node *left;
} Node;

BinaryTree *constructor(int value);
Node *lastNodeExtremeRight(Node *node);
Node *lastNodeExtremeLeft(Node *node);
#endif // DEBUG
