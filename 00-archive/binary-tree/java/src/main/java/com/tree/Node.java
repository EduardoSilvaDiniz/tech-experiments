package main.java.com.tree;

public class Node {
  protected int key;
  protected Node left;
  protected Node right;
  protected int grau;

  Node(int key) {
    this.key = key;
    this.left = null;
    this.right = null;
    this.grau = 0;
  }
}
