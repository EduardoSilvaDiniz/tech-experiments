#ifndef TREE_H
#define TREE_H
#include "Node.hpp"

class Tree : public Node {
private:
  Node *root;
  Node *left;

  Node *insert(int data, Node *curr);
  int inorder(Node *curr);
  int preorder(Node *curr);
  int posorder(Node *curr);

public:
  Tree(int data) { this->root = new Node(data); };
  Node *insert(int data) { this.root };
  int inorder(Node *curr);
  int preorder(Node *curr);
  int posorder(Node *curr);
};

#endif // !TREE_H
