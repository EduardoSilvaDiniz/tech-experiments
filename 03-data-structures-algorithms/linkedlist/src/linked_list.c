#include "linked_list.h"
#include <stdio.h>
#include <stdlib.h>

Node *new_node(int data) {
  Node *node = malloc(sizeof(Node));

  if (node == NULL) {
    fprintf(stderr, "Erro de alocação\n");
    free(node);
    return NULL;
  }
  node->data = data;
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

int length(Node *head) {
  if (head == NULL)
    return 0;

  else
    return 1 + length(head->next);
}

Node *swap(Node *ptr1, Node *ptr2) {
  Node *tmp = ptr2->next;
  ptr2->next = ptr1;
  ptr1->next = tmp;
  return ptr2;
}

Node *sort(Node **head, int count) {
  Node **h = NULL;
  int swapped;

  for (int i = 0; i <= count; i++) {
    h = head;
    swapped = 0;
    for (int j = 0; j < count - i - 1; j++) {
      Node *p1 = *h;
      Node *p2 = p1->next;
      if (p1->data > p2->data) {
        *h = swap(p1, p2);
        swapped = 1;
      }
      h = &(*h)->next;
    }
    if (swapped == 0)
      break;
  }
}

void changeNodeVal(Node *head, int n, int value) {
  Node *current = head;
  for (int i = 0; i < n; i++)
    current = current->next;

  current->data = value;
}
Node* get_node(Node *head, int n) {
  if (head == NULL) {
    return NULL;

  } else if (n <= 0) {
    return head;

  } else {
    return get_node(head->next, n - 1);
  }
}

int insertHead(Node **head, int value) {
  if (*head != NULL)
    return -1;

  Node *newNode = malloc(sizeof(Node));
  newNode->data = value;
  newNode->next = *head;
  *head = newNode;
  return newNode->data;
}

int insertHalf(Node *head, int value, int n) {
  if (head == NULL)
    return -1;

  Node *current = head;

  for (int i = 0; i < n; i++)
    current = current->next;

  Node *newNode = malloc(sizeof(Node));

  newNode->data = value;
  newNode->next = current->next;
  current->next = newNode;
  return newNode->data;
}

Node *insert_end(Node *head, int data) {
  if (head == NULL)
    return new_node(data);

  head->next = insert_end(head->next, data);
  return head;
}

int removeFistNode(Node **head) {
  if (*head == NULL)
    return -1;

  int retval = -1;
  Node *nextNode = NULL;

  nextNode = (*head)->next;
  retval = (*head)->data;
  free(*head);
  *head = nextNode;

  return retval;
}

int removeLastNode(Node *head) {
  int retval = 0;

  if (head->next == NULL) {
    retval = head->data;
    free(head);
    return retval;
  }

  Node *current = head;
  while (current->next->next != NULL)
    current = current->next;

  retval = current->next->data;
  free(current->next);
  current->next = NULL;
  return retval;
}

int removeByIndex(Node **head, int n) {
  int retval = 0;

  if (n == 0)
    return removeFistNode(head);

  Node *current = *head;

  for (int i = 0; i < n - 1; i++) {
    if (current->next == NULL)
      return -1;
    current = current->next;
  }
  if (current->next == NULL)
    return -1;

  Node *tempNode = current->next;
  retval = tempNode->data;
  current->next = tempNode->next;
  free(tempNode);
  return retval;
}

int removeByVal(Node **head, int value) {
  int retval = 0;
  Node *current = *head;
  while (current->next->data != value)
    current = current->next;

  Node *tempNode = current->next;
  retval = tempNode->data;
  current->next = tempNode->next;
  free(tempNode);
  return retval;
}

Node *deleteListNodes(Node *head) {
  Node *current = head;
  Node *tmp;
  while (current != NULL) {
    tmp = current->next;
    current->data = 0;
    current->next = NULL;
    current = tmp;
  }
  Node *newHead = NULL;
  return newHead;
}
