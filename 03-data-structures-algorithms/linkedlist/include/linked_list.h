#ifndef LINKED_LIST_H
#define LINKED_LIST_H

typedef struct Node {
  int data;
  struct Node *next;
} Node;

Node *new_node(int data);
void traverse(Node *head);
int length(Node *head);
Node *deleteListNodes(Node *head);
Node *sort(Node **head, int count);
Node *swap(Node *ptr1, Node *ptr2);
int insertHalf(Node *head, int value, int index);
int insertHead(Node **head, int value);
Node *insert_end(Node *head, int data);
int removeByIndex(Node **head, int index);
int removeByVal(Node **head, int value);
int removeFistNode(Node **head);
int removeLastNode(Node *head);
Node *get_node(Node *head, int index);
int sizeTail(Node *head);
void changeNodeVal(Node *head, int index, int value);

#endif
