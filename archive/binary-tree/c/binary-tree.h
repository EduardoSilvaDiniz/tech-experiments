#ifndef BINARY_TREE_H
#define BINARY_TREE_H

typedef struct node Node;
typedef struct node {
  int data;
  Node *right;
  Node *left;
  Node *parent;
} Node;

Node *minimum(Node *curr);
Node *maximum(Node *curr);
Node *sucessor(Node *curr);
void insert(int data, struct node *curr);
Node *search(int value, struct node *curr);
Node *delete(int value, struct node *curr);
void inOrder(struct node *curr);
Node *createNode(int data);
#endif // DEBUG
