#include "include/Node.hpp"
#include "include/Tree.hpp"
int main() {
  Tree *tree = new Tree(10);
  tree->insert(12, tree);
  tree->insert(13, tree);
  tree->insert(14, tree);
  tree->insert(15, tree);
  tree->insert(16, tree);
  tree->inorder(tree);
}
