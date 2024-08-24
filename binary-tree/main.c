#include <stdio.h>
#include <stdlib.h>

typedef struct node {
  int value;
  struct node *right;
  struct node *left;
} node_t;

node_t *createNode(int value);
void addNodeToTree(node_t *node, node_t *head);
void searchFreeSpaceAndAddNode(node_t *node, node_t *head);
void showAllTrees(node_t *head);

int main() {
  node_t *seedTree = createNode(10);
  searchFreeSpaceAndAddNode(createNode(9), seedTree);
  searchFreeSpaceAndAddNode(createNode(11), seedTree);
  searchFreeSpaceAndAddNode(createNode(12), seedTree);
  searchFreeSpaceAndAddNode(createNode(14), seedTree);
  searchFreeSpaceAndAddNode(createNode(9), seedTree);
  searchFreeSpaceAndAddNode(createNode(7), seedTree);
  searchFreeSpaceAndAddNode(createNode(1), seedTree);
  searchFreeSpaceAndAddNode(createNode(34), seedTree);
  searchFreeSpaceAndAddNode(createNode(25), seedTree);
  searchFreeSpaceAndAddNode(createNode(14), seedTree);
  searchFreeSpaceAndAddNode(createNode(8), seedTree);
  searchFreeSpaceAndAddNode(createNode(5), seedTree);
  searchFreeSpaceAndAddNode(createNode(23), seedTree);
  searchFreeSpaceAndAddNode(createNode(16), seedTree);
  showAllTrees(seedTree);
  return 0;
}

node_t *createNode(int value) {
  node_t *node = NULL;
  node = malloc(sizeof(node_t));
  if (node == NULL)
    return NULL;

  node->value = value;
  node->right = NULL;
  node->left = NULL;

  return node;
}

void searchFreeSpaceAndAddNode(node_t *node, node_t *head) {
  if (node == NULL || head == NULL)
    return;

  if (node->value > head->value) {
    if (head->right == NULL) {
      head->right = node;
      return;
    }

    searchFreeSpaceAndAddNode(node, head->right);
  } else if (node->value < head->value) {
    if (head->left == NULL) {
      head->left = node;
      return;
    }

    searchFreeSpaceAndAddNode(node, head->left);
  }
}

void showAllTrees(node_t *head) {
  if (head == NULL)
    return;

  showAllTrees(head->left);
  printf("%d ", head->value);
  showAllTrees(head->right);
}
