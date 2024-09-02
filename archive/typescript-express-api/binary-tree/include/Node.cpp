#include "Node.hpp"
#include <cstddef>

Node::Node(int data) {
  this->data = data;
  this->right = NULL;
  this->left = NULL;
  this->parent = NULL;
}
