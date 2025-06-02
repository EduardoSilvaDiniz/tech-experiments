#include "sort.h"
#include "linked_list.h"
#include <stdio.h>

Node *swap(Node *ptr1, Node *ptr2) {
  Node *tmp = ptr2->next;
  ptr2->next = ptr1;
  ptr1->next = tmp;
  return ptr2;
}

Node *sort(Node **head, int count) {
  Node **h = NULL;

  for (int i = 0; i <= count; i++) {
    h = head;
    int swapped = 0;
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
	return NULL;
}
