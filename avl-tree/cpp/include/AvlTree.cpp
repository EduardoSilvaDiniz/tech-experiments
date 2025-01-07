#include "AvlTree.hpp"
#include "Node.hpp"
#include <cstdio>
#include <iostream>
#include <ostream>

Node *AvlTree::insert(int data, Node *curr, int rank) {
  if (curr == nullptr) {
    curr = new Node(data, rank);
    return curr;
  }

  if (data < curr->data) {
    curr->left = insert(data, curr->left, ++rank);
  }
  if (data > curr->data) {
    curr->right = insert(data, curr->right, ++rank);
  }
  return curr;
}

int AvlTree::showRank(Node *curr) {
  if (curr == nullptr) {
    return 0;
  }

  showRank(curr->left);
  std::cout << curr->data << ",";
  std::cout << curr->rank << " ";
  showRank(curr->right);
  return 0;
}

int AvlTree::inorder(Node *curr) {
  if (curr == nullptr) {
    return 0;
  }

  inorder(curr->left);
  std::cout << curr->data << " ";
  inorder(curr->right);
  return 0;
}
int AvlTree::preorder(Node *curr) {
  if (curr == nullptr) {
    return 0;
  }

  std::cout << curr->data << " ";
  preorder(curr->left);
  preorder(curr->right);
  return 0;
}
int AvlTree::posorder(Node *curr) {
  if (curr == nullptr)
    return 0;

  posorder(curr->left);
  posorder(curr->right);
  std::cout << curr->data << " ";
  return 0;
}

Node *AvlTree::search(int data, Node *curr) {
  if (curr == nullptr || data == curr->data)
    return curr;

  if (data < curr->data)
    return search(data, curr->left);

  else
    return search(data, curr->right);
}

Node *AvlTree::deleteNode(int data, Node *curr) {
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

Node *AvlTree::sucessor(Node *curr) {
  if (curr->right != nullptr) {
    return AvlTree::minimum(curr->right);
  } else if (curr->left != nullptr) {
    return AvlTree::maximum(curr->left);
  } else {
    return nullptr;
  }
}

Node *AvlTree::minimum(Node *curr) {
  if (curr->left == nullptr) {
    return curr;
  }

  return minimum(curr->left);
}

Node *AvlTree::maximum(Node *curr) {
  if (curr->right == nullptr) {
    return curr;
  }

  return maximum(curr->right);
}
