#include "binary-tree.h"
#include <stdio.h>

int main() {
  BinaryTree *tree = constructor(10);
  tree->insert(9, tree->root);
  tree->insert(15, tree->root);
  tree->insert(13, tree->root);
  tree->insert(12, tree->root);
  tree->insert(14, tree->root);

  printf("%d\n", tree->delete (13, tree->root)->data);
  tree->inorderTreeWalk(tree->root);
  return 0;
}
