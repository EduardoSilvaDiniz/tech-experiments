#ifndef BINARY_TREE_H
#define BINARY_TREE_H

#include "Node.hpp"
#include <cstdio>

class AvlTree {
private:
  Node *root;

  Node *insert(int data, Node *curr);
  int inorder(Node *curr);
  int preorder(Node *curr);
  int posorder(Node *curr);
  Node *search(int data, Node *curr);
  Node *deleteNode(int data, Node *root);
  Node *sucessor(Node *curr);
  Node *minimum(Node *curr);
  Node *maximum(Node *curr);

public:
  AvlTree(int data) { this->root = new Node(data); }
  Node *insert(int data) { return insert(data, this->root); }
  int inorder() { return inorder(this->root); }
  int preorder() { return preorder(this->root); }
  int posorder() { return posorder(this->root); }
  Node *search(int data) { return search(data, this->root); };
  Node *deleteNode(int data) { return deleteNode(data, this->root); };
  Node *sucessor(int data) { return sucessor(search(data, this->root)); };
  Node *minimum() { return minimum(this->root); };
  Node *maximum() { return maximum(this->root); };
};
#endif
