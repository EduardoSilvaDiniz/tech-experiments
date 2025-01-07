#include "include/AvlTree.hpp"
#include <algorithm>
#include <iostream>

int main() {
  AvlTree *tree = new AvlTree(50);
  tree->insert(10);
  tree->insert(11);
  tree->insert(12);
  tree->insert(13);
  tree->insert(14);
  tree->showRank();

  return 0;
}
