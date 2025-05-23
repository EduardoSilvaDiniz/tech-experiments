struct ListNode* NEWmergeTwoLists(struct ListNode * list1, struct ListNode * list2)
{
  if(!list1) return list2;
  if(!list2) return list1;
  struct ListNode* itteratorl1,* backOfNewList;
  if(list1->val > list2->val) 
  {
    backOfNewList=list2;
    list2=list1
    list1=backOfNewList;
  }
  else{
    backOfNewList=list1;
  }
  itteratorl1 = list1->next; 
  while(itteratorl1 && list2)
  {
    if(itteratorl1->val < list2->val)
    {
      backOfNewList->next=itteratorl1; 
      itteratorl1 = itteratorl1->next;
    }
    else
    {
      backOfNewList->next=list2;
      list2=list2->next;
    }
    backOfNewList=backOfNewList->next;
  }
  while (itteratorl1)
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

