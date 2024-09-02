#ifndef BINARY_TREE_H
#define BINARY_TREE_H
#include "Node.hpp"
class BinaryTree {
private:
  Node *root;

  void insert(int data, Node *curr);
  void inorder(Node *curr);
  Node *search(int data, Node *curr);
  Node *deleteLeaf(int data, Node *curr);
  Node *sucessor(Node *curr);
  Node *minimum(Node *curr);
  Node *maximum(Node *curr);
  void deleteRootSubTree(int data, Node *curr);

public:
  BinaryTree(int data) { this->root = new Node(data); }
  void insert(int data) { insert(data, this->root); }
  void inorder() { inorder(this->root); }
  Node *search(int data) { return search(data, this->root); };
  Node *deleteLeaf(int data) { return deleteLeaf(data, this->root); };
  void deleteRootSubTree(int data) { deleteRootSubTree(data, this->root); };
  Node *sucessor(int data) { return sucessor(search(data, this->root)); };
  Node *minimum() { return minimum(this->root); };
  Node *maximum() { return maximum(this->root); };
};
#endif
