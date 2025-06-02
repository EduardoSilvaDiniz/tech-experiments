#include "binary_tree.h"
#include <stdio.h>
#include <stdlib.h>

void insert(int value, Node *root) {
  if (value < 0 || root == NULL)
    return;

  if (value > root->data) {
    if (root->right == NULL) {
      root->right = create_node(value);
      return;
    }

    insert(value, root->right);
  } else if (value < root->data) {
    if (root->left == NULL) {
      root->left = create_node(value);
      return;
    }

    insert(value, root->left);
  }
}

void preorder_traversal(Node *root) {
  if (root == NULL)
    return;

  printf("%d ", root->data);
  preorder_traversal(root->left);
  preorder_traversal(root->right);
}

void inorder_traversal(Node *root) {
  if (root == NULL)
    return;

  inorder_traversal(root->left);
  printf("%d ", root->data);
  inorder_traversal(root->right);
}

void postorder_traversal(Node *root) {
  if (root == NULL)
    return;

  postorder_traversal(root->left);
  postorder_traversal(root->right);
  printf("%d ", root->data);
}

Node *search(int value, Node *root) {
  if (root == NULL || value == root->data)
    return root;

  if (value < root->data)
    return search(value, root->left);

  else
    return search(value, root->right);
}

Node *delete(int value, Node *root) {
  if (root == NULL)
    return root;

  if (value < root->data) {
    root->left = delete(value, root->left);
  } else if (value > root->data) {
    root->right = delete(value, root->right);
  }

  else {
    if (root->left == NULL && root->right == NULL) {
      free(root);
      return NULL;
    }

    else if (root->left == NULL || root->right == NULL) {
      Node *temp = (root->left) ? root->left : root->right;
      free(root);
      return temp;
    }

    else {
      const Node *temp = minimum(root->right);
      root->data = temp->data;
      root->right = delete(temp->data, root->right);
    }
  }

  return root;
}

Node *sucessor(Node *root) {
  if (root->right != NULL)
    return minimum(root->right);
  else
    return maximum(root->left);
}

Node *minimum(Node *curr) {
  if (curr->left == NULL)
    return curr;

  return minimum(curr->left);
}

Node *maximum(Node *curr) {
  if (curr->right == NULL)
    return curr;

  return maximum(curr->right);
}

Node *create_node(int value) {
  Node *new_node = malloc(sizeof(Node));
  if (new_node == NULL) {
    printf("Falha na alocação\n");
    free(new_node);
    return NULL;
  }

  new_node->data = value;
  new_node->left = NULL;
  new_node->right = NULL;
  return new_node;
}

Node *insert_left(Node *root, int value) {
  if (root == NULL)
    return root;
  else if (root->left == NULL) {
    Node *new_node = create_node(value);
    root->left = new_node;
    return root;
  } else {
    root->left = insert_left(root->left, value);
    return root;
  }
}
Node *insert_right(Node *root, int value) {
  if (root == NULL)
    return root;
  else if (root->right == NULL) {
    Node *new_node = create_node(value);
    root->right = new_node;
    return root;
  } else {
    root->right = insert_right(root->right, value);
    return root;
  }
}
