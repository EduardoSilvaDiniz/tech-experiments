#include <stdio.h>
#include "linkedList.h"

struct ListNode* mergeTwoLists(struct ListNode * list1, struct ListNode * list2) // Minha tentativa
{
  struct ListNode* merge;
  struct ListNode* current;
  if (list1 == NULL && list2 == NULL)
    return merge;
  if (list1 != NULL)
  {
    current = list1;
    merge = beginListNode(current->val);
    current = current->next;
    while (current != NULL)
    {
      insertTail(merge, current->val);
      current = current->next;
    }
  }
  else
  {
    current = list2;
    merge = beginListNode(current->val);
    current = current->next;
  }
  if(list2 != NULL)
  {
    if (list1 != NULL)
      current = list2;
    while (current != NULL)
    {
      insertTail(merge, current->val);
      current = current->next;
    }
  }
  sort(merge, sizeTail(merge));
  return merge;
}

struct ListNode* NEWmergeTwoLists(struct ListNode * list1, struct ListNode * list2) // solução de um usuario do leetcode
{
  if(!list1) return list2;
  if(!list2) return list1;
  struct ListNode* itteratorl1,* backOfNewList;
  if(list1->val > list2->val) // por que fazer essa verificação? testando para saber qual será o primeiro node na nova lista
  {
    backOfNewList=list2;
    list2=list1;
    list1=backOfNewList; // list1=list2 list2=list1, porque?
  }
  else{
    backOfNewList=list1;
  }
  itteratorl1 = list1->next; // recebeu o proximo node do list1
  while(itteratorl1 && list2) // enquanto itteratorl1 e list2 != NULL, se um deles ficar NULL vai parar
  {
    if(itteratorl1->val < list2->val)
    {
      backOfNewList->next=itteratorl1; // se o valor do node da list1 for menor, o next da nova lista vai apontar para ele
      itteratorl1 = itteratorl1->next;
    }
    else // senão, vai apontar para o node da list2
    {
      backOfNewList->next=list2;
      list2=list2->next;
    }
    backOfNewList=backOfNewList->next; // trocando para o proximo node, que deve ser o ultimo
  }
  while (itteratorl1) // colocando na nova lista os valores que ficou para tras
  {
    backOfNewList->next=itteratorl1;
    itteratorl1=itteratorl1->next;
    backOfNewList=backOfNewList->next;
  }
  while (list2)
  {
    backOfNewList->next=list2;
    list2=list2->next;
    backOfNewList=backOfNewList->next;
  }
  return list1;
}


int main() {
  struct ListNode* head = beginListNode(1);
  printList(head);
  return 0;
}
