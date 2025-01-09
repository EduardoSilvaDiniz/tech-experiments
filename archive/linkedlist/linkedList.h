#ifndef LINKEDLIST_LINKEDLIST_H
#define LINKEDLIST_LINKEDLIST_H
#include <stdio.h>
#include <stdlib.h>
struct ListNode {
  int val;
  struct ListNode * next;
};
struct ListNode * beginListNode(int val)
{
  struct ListNode *head = malloc(sizeof(struct ListNode));
  head->val=val;
  return head;
}
void printList(struct ListNode * n)
{
  printf("[");
  while (n)
  {
    printf("%d -> ", n->val);
    n = n->next;
  }
  printf("NULL]\n");
}
int sizeTail(struct ListNode * head)
{
  struct ListNode * current = head;
  int size = 0;
  while (current)
  {
    size++;
    current = current->next;
  }
  return size;
}

struct ListNode* swap(struct ListNode * ptr1, struct ListNode * ptr2)
{
  struct ListNode* tmp = ptr2->next;
  ptr2->next=ptr1;
  ptr1->next=tmp;
  return ptr2;
}

struct ListNode* sort(struct ListNode** head, int count)
{
  struct ListNode** h = NULL;
  int swapped;

  for (int i = 0; i <= count; i++)
  {
    h = &head;
    swapped = 0;
    for (int j = 0; j < count - i - 1; j++)
    {
      struct ListNode* p1=*h;
      struct ListNode* p2=p1->next;
      if(p1->val > p2->val)
      {
        *h= swap(p1, p2);
        swapped = 1;
      }
      h = &(*h)->next;
    }
    if (swapped == 0)
      break;
  }
}

void changeNodeVal(struct ListNode * head, int n, int val)
{
  struct ListNode * current = head;
  for (int i = 0; i < n; i++)
    current = current->next;

  current->val=val;
}
int showNodeVal(struct ListNode * head, int n)
{
  struct ListNode * current = head;
  for (int i = 0; i < n; i++)
    current = current->next;

  return current->val;
}

int insertHead(struct ListNode ** head, int val)
{
  if(*head != NULL)
    return -1;

  struct ListNode *newNode = malloc(sizeof(struct ListNode));
  newNode->val = val;
  newNode->next = *head;
  *head = newNode;
  return newNode->val;
}

int insertHalf(struct ListNode * head, int val, int n)
{
  if(head == NULL)
    return -1;

  struct ListNode * current = head;

  for (int i = 0; i < n; i++)
    current = current->next;

  struct ListNode *newNode = malloc(sizeof(struct ListNode));

  newNode->val = val;
  newNode->next = current->next;
  current->next = newNode;
  return newNode->val;
}

int insertTail(struct ListNode * head, int val)
{
  if(head == NULL)
    return -1;

  struct ListNode * current = head;

  while(current->next != NULL)
    current = current->next;

  struct ListNode* newNode = malloc(sizeof(struct ListNode));
  newNode->val=val;
  current->next=newNode;
  return newNode->val;
}


int removeFistNode(struct ListNode ** head)
{
  if (*head == NULL)
    return -1;

  int retval = -1;
  struct ListNode * nextNode = NULL;

  nextNode = (*head)->next;
  retval = (*head)->val;
  free(*head);
  *head= nextNode;

  return retval;
}

int removeLastNode(struct ListNode * head)
{
  int retval = 0;

  if (head->next == NULL)
  {
    retval = head->val;
    free(head);
    return retval;
  }

  struct ListNode * current = head;
  while (current->next->next != NULL)
    current = current->next;

  retval = current->next->val;
  free(current->next);
  current->next=NULL;
  return retval;
}

int removeByIndex(struct ListNode ** head, int n)
{
  int retval = 0;

  if (n == 0)
    return removeFistNode(head);

  struct ListNode * current = *head;

  for (int i = 0; i < n-1; i++)
  {
    if(current->next == NULL)
      return -1;
    current = current->next;
  }
  if (current->next == NULL)
    return -1;

  struct ListNode * tempNode = current->next;
  retval = tempNode->val;
  current->next=tempNode->next;
  free(tempNode);
  return retval;
}

int removeByVal(struct ListNode ** head, int val)
{
  int retval = 0;
  struct ListNode * current = *head;
  while (current->next->val != val)
    current = current->next;

  struct ListNode * tempNode = current->next;
  retval = tempNode->val;
  current->next=tempNode->next;
  free(tempNode);
  return retval;
}

struct ListNode* deleteListNodes(struct ListNode* head)
{
  struct ListNode* current = head;
  struct ListNode* tmp;
  while (current != NULL)
  {
    tmp = current->next;
    current->val=(int)NULL;
    current->next=NULL;
    current=tmp;
  }
  struct ListNode* newHead=NULL;
  return newHead;
}
#endif // LINKEDLIST_LINKEDLIST_H


