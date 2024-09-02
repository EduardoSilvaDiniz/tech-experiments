#ifndef NODE_H
#define NODE_H
class Node {
private:
public:
  int data;
  Node *left;
  Node *right;
  Node *parent;
  Node(int value);
};
#endif
