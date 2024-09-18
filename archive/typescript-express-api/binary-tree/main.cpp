#include "include/BinaryTree.hpp"
#include <iostream>

int main() {
  BinaryTree *tree = new BinaryTree(50);
  tree->insert(10);
  tree->insert(11);
  tree->insert(12);
  tree->insert(13);
  tree->insert(14);
  tree->preorder();
  std::cout << std::endl << tree->deleteNode(12) << std::endl;
  tree->preorder();
  return 0;
}
