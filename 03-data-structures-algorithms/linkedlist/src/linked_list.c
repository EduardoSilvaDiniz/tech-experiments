#include "linked_list.h"
#include <stdio.h>
#include <stdlib.h>

Node *create_node(int value) {
  Node *node = malloc(sizeof(Node));

  if (node == NULL) {
    fprintf(stderr, "Erro de alocação\n");
    free(node);
    return NULL;
  }
  node->data = value;
  node->next = NULL;
  return node;
}

void traverse(Node *head) {
  if (head == NULL) {
    printf("\n");
    return;
  }

  printf("%d ", head->data);

  traverse(head->next);
}

int search_data(Node *head, int data) {
  if (head == NULL) {
    return -1;
  } else if (head->data == data) {
    return head->data;
  } else {
    return search_data(head->next, data);
  }
}

int length(Node *head) {
  if (head == NULL)
    return 0;

  else
    return 1 + length(head->next);
}

Node *change_data_by_id(Node *head, int value, int index) {
  if (head == NULL) {
    return head;
  } else if (index <= 0) {
    head->data = value;
    return head;
  } else {
    head->next = change_data_by_id(head->next, value, index - 1);
    return head;
  }
}

Node *get_node(Node *head, int index) {
  if (head == NULL)
    return NULL;
  else if (index <= 0)
    return head;
  else
    return get_node(head->next, index - 1);
}

Node *insert_to_start(Node *head, int value) {
  if (head != NULL)
    return head;

  Node *new_head = create_node(value);
  new_head->next = head;
  return new_head;
}

Node *insert_to_index(Node *head, int value, int index) {
  if (head == NULL) {
    return head;
  } else if (index <= 0) {
    Node *new_node = create_node(value);
    new_node->next = head;
    return new_node;
  } else {
    head->next = insert_to_index(head->next, value, index - 1);
    return head;
  }
}

Node *insert_to_end(Node *head, int value) {
  if (head == NULL)
    return create_node(value);

  head->next = insert_to_end(head->next, value);
  return head;
}

Node *remove_first_node(Node *head) {
  if (head == NULL)
    return head;

  Node *next_node = head->next;
  free(head);

  return next_node;
}

Node *remove_last_node(Node *head) {
  if (head->next == NULL) {
    free(head);
    return NULL;
  } else {
    head->next = remove_last_node(head->next);
    return head;
  }
}

Node *remove_by_index(Node *head, int index) {
  if (head == NULL) {
    return head;
  } else if (index <= 0) {
    Node *temp_next = head->next;
    free(head);
    return temp_next;
  } else {
    head->next = remove_by_index(head->next, index - 1);
    return head;
  }
}

Node *remove_by_data(Node *head, int value) {
  if (head == NULL) {
    return head;
  } else if (head->data == value) {
    Node *temp_next = head->next;
    free(head);
    return temp_next;
  } else {
    head->next = remove_by_data(head->next, value);
    return head;
  }
}

Node *free_linked(Node *head) {
  if (head->next != NULL) {
    head->next = free_linked(head->next);
    free(head);
    return NULL;
  } else
    return head;
}
