package main.java.com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
  Node root;

  private Node addRecursive(Node current, int key) {
    if (current == null)
      return new Node(key);

    if (key < current.key)
      current.left = addRecursive(current.left, key);
    else if (key > current.key)
      current.right = addRecursive(current.right, key);
    else
      return current;

    return current;
  }

  public void add(int key) {
    root = addRecursive(root, key);
  }

  private boolean containsNodeRecursive(Node current, int key) {
    if (current == null)
      return false;
    if (key == current.key)
      return true;
    return key < current.key
        ? containsNodeRecursive(current.left, key) : containsNodeRecursive(current.right, key);
  }

  public boolean containsNode(int key) {
    return containsNodeRecursive(root, key);
  }

  public void delete(int value) {
    root = deleteRecursive(root, value);
  }

  private Node deleteRecursive(Node current, int key) {
    if (current == null)
      return null;

    if (key == current.key) {
      if (current.left == null && current.right == null)
        return null;
      if (current.right == null)
        return current.left;
      if (current.left == null)
        return current.right;

      // case 3: 2 children
      int smallestValue = findSmallestValue(current.right);
      current.key = smallestValue;
      current.right = deleteRecursive(current.right, smallestValue);
      return current;
    }

    if (key < current.key) {
      current.left = deleteRecursive(current.left, key);
      return current;
    }
    current.right = deleteRecursive(current.right, key);
    return current;
  }

  public void preOrder(Node node){
    if (node != null){
      System.out.println(" " + node.key);
      inOrder(node.left);
      inOrder(node.right);
    }
  }
  public void inOrder(Node node){
    if (node != null){
      inOrder(node.left);
      System.out.println(" " + node.key);
      inOrder(node.right);
    }
  }
  public void posOrder(Node node){
    if (node != null){
      inOrder(node.left);
      inOrder(node.right);
      System.out.println(" " + node.key);
    }
  }

  public void traverseLevelOrder(){
    if (root == null)
      return;

    Queue<Node> nodes = new LinkedList<>();
    nodes.add(root);

    while (!nodes.isEmpty()){
      Node node = nodes.remove();

      System.out.println(" " + node.key);

      if (node.left != null)
        nodes.add(node.left);
      if (node.right != null)
        nodes.add(node.right);
    }
  }

  private int findSmallestValue(Node root) {
    return root.left == null ? root.key : findSmallestValue(root.left);
  }
}