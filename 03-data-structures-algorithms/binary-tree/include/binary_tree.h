#ifndef BINARY_TREE_H
#define BINARY_TREE_H

typedef struct Node {
  int data;
  struct Node *left;
  struct Node *right;
} Node;

void inorder_traversal(Node *root);
void preorder_traversal(Node *root);
void postorder_traversal(Node *root);
void insert(int value, Node *root);
Node *create_node(int value);
Node *insert_left(struct Node *root, int value);
Node *insert_right(struct Node *root, int value);
Node *maximum(Node *curr);
Node *minimum(Node *curr);
Node *sucessor(Node *curr);
Node *delete(int data, Node *curr);
Node *search(int data, Node *curr);

#endif
