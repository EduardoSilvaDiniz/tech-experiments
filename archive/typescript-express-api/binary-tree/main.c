#include "binary-tree.h"

int main() {
  BinaryTree *tree = constructor(10);
  tree->add(12, tree->base);
  tree->forEach(tree->base);
  tree->get(12, tree->base);
  return 0;
}
