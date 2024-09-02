#include "include/BinaryTree.hpp"

int main() {
  BinaryTree *tree = new BinaryTree(50);
  tree->insert(31);
  tree->insert(24);
  tree->insert(20);
  tree->insert(12);
  tree->insert(18);
  tree->insert(6);
  tree->insert(3);
  tree->insert(145);
  tree->insert(100);
  tree->insert(175);
  tree->insert(180);
  tree->insert(170);
  tree->insert(135);
  tree->insert(90);
  tree->insert(99);
  tree->insert(80);
  tree->insert(88);
  tree->insert(85);
  tree->deleteRootSubTree(90);
  tree->inorder();

  return 0;
}
