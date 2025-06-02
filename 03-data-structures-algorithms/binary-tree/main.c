#include "binary_tree.h"
#include <stdio.h>
#include <stdlib.h>
#define FAIL() printf("\nfailure in %s() line %d\n", __func__, __LINE__)
#define _assert(test)                                                          \
  do {                                                                         \
    if (!(test)) {                                                             \
      FAIL();                                                                  \
      return 1;                                                                \
    }                                                                          \
  } while (0)
#define _verify(test)                                                          \
  do {                                                                         \
    int r = test();                                                            \
    tests_run++;                                                               \
    if (r)                                                                     \
      return r;                                                                \
  } while (0)
int tests_run = 0;

int create_node_test() {
  int value = 10;
  const Node *root = create_node(value);
  _assert(root != NULL);
  _assert(root->data == value);
  return 0;
}

int insert_left_test(){
  int value = 10;
	int value_two = 8;
  Node *root = create_node(value);
	root = insert_left(root, value_two);
	_assert(root->left != NULL);
	_assert(root->left->data == value_two);
  return 0;
}

int insert_right_test(){
  int value = 10;
	int value_two = 12;
  Node *root = create_node(value);
	root = insert_right(root, value_two);
	_assert(root->right != NULL);
	_assert(root->right->data == value_two);
  return 0;
}

int insert_test(){
  int value = 10;
	int value_right = 12;
	int value_left = 8;

  Node *root = create_node(value);
	insert(value_right, root);
	insert(value_left, root);
	_assert(root->right->data == value_right);
	_assert(root->left->data == value_left);
	return 0;
}

int sucessor_test(){
  int value = 10;
	int value_right = 12;
	int value_left = 8;

  Node *root = create_node(value);
	insert(value_left, root);
	Node * sucessor_node = sucessor(root);
	_assert(sucessor_node->data == value_left);

	insert(value_right, root);
	sucessor_node = sucessor(root);
	_assert(sucessor_node->data == value_right);
	free(sucessor_node);
	return 0;
}

int delete_test_pre(){
  int value = 10;
	int value_deleted = 15;
	int value_two = 13;
	int value_thred = 14;

  Node *root = create_node(value);

	insert(value_two, root);
	insert(value_thred, root);
	insert(value_deleted, root);

	delete(value_deleted, root);
	_assert(search(value_deleted, root) == NULL);
	return 0;
}

int delete_test_in(){
  int value = 10;
	int value_deleted = 15;
	int value_two = 13;
	int value_thred = 14;

  Node *root = create_node(value);

	insert(value_two, root);
	insert(value_deleted, root);
	insert(value_thred, root);

	delete(value_deleted, root);
	_assert(search(value_deleted, root) == NULL);
	return 0;
}

int delete_test_pos(){
  int value = 10;
	int value_deleted = 15;
	int value_two = 13;
	int value_thred = 14;

  Node *root = create_node(value);

	insert(value_deleted, root);
	insert(value_two, root);
	insert(value_thred, root);

	delete(value_deleted, root);
	_assert(search(value_deleted, root) == NULL);
	return 0;
}

int search_test() {
  int value = 10;
	int value_last = 15;
	int value_two = 13;
	int value_thred = 14;

  Node *root = create_node(value);
	insert(value_two, root);
	insert(value_thred, root);
	insert(value_last, root);
	_assert(search(value_last, root)->data == value_last);
	return 0;
}

int all_tests() {
  _verify(create_node_test);
  _verify(insert_left_test);
  _verify(insert_right_test);
  _verify(insert_test);
	_verify(sucessor_test);
	_verify(delete_test_pre);
	_verify(delete_test_in);
	_verify(delete_test_pos);
	_verify(search_test);
  return 0;
}

int main() {
  int result = all_tests();
  if (result == 0)
    printf("PASSED\n");

  printf("Tests run: %d\n", tests_run);
  int value = 10;
	int value_last = 15;
	int value_two = 13;
	int value_thred = 14;

  Node *root = create_node(value);
	insert(value_two, root);
	insert(value_thred, root);
	insert(value_last, root);
	insert(6, root);
	insert(2, root);
	insert(5, root);

	preorder_traversal(root);
	printf("\n");
	inorder_traversal(root);
	printf("\n");
	postorder_traversal(root);
	printf("\n");

  return result != 0;
}
