#ifndef LINKED_LIST_H
#define LINKED_LIST_H

typedef struct Node {
  int data;
  struct Node *next;
} Node;

Node *change_data_by_id(Node *head, int value, int index);
Node *create_node(int data);
Node *free_linked(Node *head);
Node *get_node(Node *head, int index);
Node *insert_to_end(Node *head, int data);
Node *insert_to_index(Node *head, int value, int index);
Node *insert_to_start(Node *head, int value);
Node *remove_by_data(Node *head, int value);
Node *remove_by_index(Node *head, int index);
Node *remove_first_node(Node *head);
Node *remove_last_node(Node *head);
int length(Node *head);
int search_data(Node *head, int data);
void traverse(Node *head);

#endif
