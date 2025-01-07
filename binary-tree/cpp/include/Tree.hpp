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
  void blabla();

public:
protected:
};

#endif // !TREE_H
