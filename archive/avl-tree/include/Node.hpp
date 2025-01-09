#ifndef NODE_H
#define NODE_H
class Node {
private:
public:
  int data;
  int rank;
  Node *left;
  Node *right;
  Node *parent;

  Node(int data, int rank); // constructor
};
#endif
