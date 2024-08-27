#ifndef BINARY_TREE_H
#define BINARY_TREE_H

typedef struct node Node;
Node *createNode(int value);
void addNodeToTree(Node *node, Node *head);
void searchFreeSpaceAndAddNode(Node *node, Node *head);
void showAllTrees(Node *head);
Node *searchNodeOnTree(Node *tree, int value);
void removeNodeOnTree(Node *tree, int value);
Node *lastNodeExtremeRight(Node *node);
Node *lastNodeExtremeLeft(Node *node);
#endif // DEBUG
