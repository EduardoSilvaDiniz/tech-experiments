#ifndef NODE_H
#define NODE_H
class Node {
private:
public:
  int data;
  Node *right;
  Node *left;
  Node(int data); // constructor
};
#endif
