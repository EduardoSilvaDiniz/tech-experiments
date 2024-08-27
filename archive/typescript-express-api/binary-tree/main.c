#include "binary-tree.h"
#include <stdio.h>

int main() {
  BinaryTree *tree = constructor(10);
  tree->add(9, tree->base);
  tree->add(11, tree->base);
  tree->forEach(tree->base);
  printf("%d\n", tree->get(11, tree->base)->data);
  return 0;
}
