#include "binary-tree.h"
#include <stdio.h>

typedef struct node {
  int value;
  struct node *right;
  struct node *left;
} Node;

int main() {
  Node *seedTree = createNode(10);
  searchFreeSpaceAndAddNode(createNode(9), seedTree);
  searchFreeSpaceAndAddNode(createNode(11), seedTree);
  searchFreeSpaceAndAddNode(createNode(12), seedTree);
  searchFreeSpaceAndAddNode(createNode(16), seedTree);
  searchFreeSpaceAndAddNode(createNode(7), seedTree);
  searchFreeSpaceAndAddNode(createNode(5), seedTree);
  searchFreeSpaceAndAddNode(createNode(1), seedTree);
  searchFreeSpaceAndAddNode(createNode(17), seedTree);
  searchFreeSpaceAndAddNode(createNode(4), seedTree);
  searchFreeSpaceAndAddNode(createNode(3), seedTree);
  searchFreeSpaceAndAddNode(createNode(13), seedTree);

  // removeNodeOnTree(seedTree, 5);
  //  removeNodeOnTree(seedTree, 13);

  showAllTrees(seedTree);

  return 0;
}
