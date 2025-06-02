#include "linked_list.h"
#include <stdio.h>
int main() {
	Node* head = new_node(5);
	insert_end(head, 6);
	insert_end(head, 7);
	insert_end(head, 8);
	insertHalf(head, 99, 2);
	removeByVal(head, 99);

	traverse(head);
	printf("%d\n", get_node(head, 2)->data);
	return 0;
}
