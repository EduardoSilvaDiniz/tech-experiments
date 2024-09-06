#include "BinaryTree.hpp"
#include "Node.hpp"
#include <cstddef>
#include <cstdio>
#include <iostream>
#include <ostream>

void BinaryTree::insert(int data, Node *curr) {
  if (data < 0 || curr == NULL)
    return;

  if (data > curr->data) {
    if (curr->right == NULL) {
      curr->right = new Node(data);
      curr->right->parent = curr;
      return;
    }

    insert(data, curr->right);
  } else if (data < curr->data) {
    if (curr->left == NULL) {
      curr->left = new Node(data);
      curr->left->parent = curr;
      return;
    }

    insert(data, curr->left);
  }
}

void BinaryTree::inorder(Node *curr) {
  if (curr == NULL)
    return;

  inorder(curr->left);
  std::cout << curr->data << " ";
  inorder(curr->right);
}

Node *BinaryTree::search(int data, Node *curr) {
  if (curr == NULL || data == curr->data)
    return curr;

  if (data < curr->data)
    return search(data, curr->left);

  else
    return search(data, curr->right);
}

Node *BinaryTree::deleteLeaf(int data, Node *curr) {
  if (curr == NULL)
    return curr;
  else if (curr->data == data) {
    if (curr->left == NULL && curr->right == NULL) {
      delete curr;
      return NULL;
    }
  } else {
    if (data < curr->data)
      curr->left = deleteLeaf(data, curr->left);
    else
      curr->right = deleteLeaf(data, curr->right);
  }

  return curr;
}

void BinaryTree::deleteRootSubTree(int data, Node *root) {
  Node *curr = search(data, root);
  if (curr->left != NULL) {
    if (curr->left->left == NULL) {
      if (curr->left->right == NULL) {
        if (curr->parent->left == curr) {
          curr->parent->left = curr->left;
          curr->left->right = curr->right;
          curr->left->parent = curr->parent;
          delete curr;
        } else {
          curr->parent->right = curr->left;
          curr->left->right = curr->right;
          curr->left->parent = curr->parent;
          delete curr;
        }
      } else {
        Node *sucessorNode = minimum(curr->left->right);
        std::cout << sucessorNode->data << std::endl;
        sucessorNode->parent->left = NULL;
        sucessorNode->parent = curr->parent;
        curr->parent->left = sucessorNode;
        sucessorNode->left = curr->left;
        sucessorNode->right = curr->right;
        delete curr;
      }
    } else {
      Node *sucessorNode = maximum(curr->left);
      std::cout << sucessorNode->data << std::endl;
      sucessorNode->parent->right = NULL;
      sucessorNode->parent = curr->parent;
      sucessorNode->left = curr->left;
      sucessorNode->right = curr->right;
    }
  } else if (curr->right != NULL) {
    if (curr->right->left == NULL && curr->right->left == NULL) {
      if (curr->parent->left == curr) {
        curr->parent->left = curr->right;
        curr->right->left = curr->left;
        curr->right->parent = curr->parent;
      } else {
        curr->parent->right = curr->right;
        curr->right->left = curr->left;
        curr->right->parent = curr->parent;
      }
    }
  }
}

Node *BinaryTree::sucessor(Node *curr) {
  if (curr->right != NULL)
    return BinaryTree::minimum(curr->right);
  else if (curr->left != NULL)
    return BinaryTree::maximum(curr->left);
  else
    return NULL;
}

Node *BinaryTree::minimum(Node *curr) {
  if (curr->left == NULL)
    return curr;

  return minimum(curr->left);
}

Node *BinaryTree::maximum(Node *curr) {
  if (curr->right == NULL)
    return curr;

  return maximum(curr->right);
}
