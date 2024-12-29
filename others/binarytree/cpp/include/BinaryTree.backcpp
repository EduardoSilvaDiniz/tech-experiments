#include "BinaryTree.hpp"
#include "Node.hpp"
#include <cstdio>
#include <iostream>
#include <ostream>

Node *BinaryTree::insert(int data, Node *curr) {
  if (curr == nullptr) {
    curr = new Node(data);
    return curr;
  }

  if (data < curr->data) {
    curr->left = insert(data, curr->left);
  }
  if (data > curr->data) {
    curr->right = insert(data, curr->right);
  }
  return curr;
}

int BinaryTree::inorder(Node *curr) {
  if (curr == nullptr)
    return 0;

  inorder(curr->left);
  std::cout << curr->data << " ";
  inorder(curr->right);
  return 0;
}
int BinaryTree::preorder(Node *curr) {
  if (curr == nullptr)
    return 0;

  std::cout << curr->data << " ";
  preorder(curr->left);
  preorder(curr->right);
  return 0;
}
int BinaryTree::posorder(Node *curr) {
  if (curr == nullptr)
    return 0;

  posorder(curr->left);
  posorder(curr->right);
  std::cout << curr->data << " ";
  return 0;
}

Node *BinaryTree::search(int data, Node *curr) {
  if (curr == nullptr || data == curr->data)
    return curr;

  if (data < curr->data)
    return search(data, curr->left);

  else
    return search(data, curr->right);
}

Node *BinaryTree::deleteNode(int data, Node *curr) {
  if (curr == nullptr)
    return nullptr;

  else if (data < curr->data) {
    curr->left = deleteNode(data, curr->left);

  } else if (data > curr->data) {
    curr->right = deleteNode(data, curr->right);

  } else {
    if (curr->left == nullptr && curr->right == nullptr) {
      delete curr;
      return nullptr;
    }
    if (curr->left == nullptr) {
      Node *temp = curr->right;
      delete curr;
      return temp;

    } else if (curr->right == nullptr) {
      Node *temp = curr->left;
      delete curr;
      return temp;

    } else {
      Node *minimumNode = minimum(curr->right);
      curr->data = minimumNode->data;
      curr->right = deleteNode(minimumNode->data, curr->right);
    }
  }
  return curr;
}

Node *BinaryTree::sucessor(Node *curr) {
  if (curr->right != nullptr)
    return BinaryTree::minimum(curr->right);
  else if (curr->left != nullptr)
    return BinaryTree::maximum(curr->left);
  else
    return nullptr;
}

Node *BinaryTree::minimum(Node *curr) {
  if (curr->left == nullptr)
    return curr;

  return minimum(curr->left);
}

Node *BinaryTree::maximum(Node *curr) {
  if (curr->right == nullptr)
    return curr;

  return maximum(curr->right);
}
