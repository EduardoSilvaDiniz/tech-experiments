#include "linked_list.h"
#include "sort.h"

int main() {
  Node *head = create_node(5);
  head = insert_to_end(head, 6);
  head = insert_to_end(head, 8);
  head = insert_to_index(head, 99, 2);
  head = insert_to_index(head, 98, 1);
  head = insert_to_end(head, 7);

	sort(&head, 6);
  traverse(head);
  return 0;
}
