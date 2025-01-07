#include "Tree.hpp"
#include "Node.hpp"

#include <iostream>

Node *Tree::insert(int data, Node *curr) {
  if (curr == nullptr) {
    curr = new Node(data);
    return curr;
  }

  int opt = 0;

  std::cout << "left(1) or right(2) ??" << std::endl;
  std::scanf("%d", &opt);
  if (opt == 1) {
    insert(data, curr->left);
  } else
    insert(data, curr->right);

  return curr;
}

int Tree::inorder(Node *curr) {
  if (curr == nullptr)
    return 0;

  inorder(curr->left);
  std::cout << curr->data << " ";
  inorder(curr->right);
  return 0;
}
int Tree::preorder(Node *curr) {
  if (curr == nullptr)
    return 0;

  std::cout << curr->data << " ";
  preorder(curr->left);
  preorder(curr->right);
  return 0;
}
int Tree::posorder(Node *curr) {
  if (curr == nullptr)
    return 0;

  posorder(curr->left);
  posorder(curr->right);
  std::cout << curr->data << " ";
  return 0;
}
