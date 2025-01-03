package com.experiments.dataStructures;

public class Node {
  public int key;
  public Node left;
  public Node right;
  public int grau;

  public Node(int key) {
    this.key = key;
    this.left = null;
    this.right = null;
    this.grau = 0;
  }
}