#include "Node.hpp"

Node::Node(int data, int rank) {
  this->data = data;
  this->rank = rank;
  this->right = nullptr;
  this->left = nullptr;
  this->parent = nullptr;
}
