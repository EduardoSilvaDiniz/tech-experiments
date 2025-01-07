package main.java.com.tree;

public class Main {
  static {
    System.out.println("iniciando!");
  }

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();
    bt.add(10);
    bt.add(12);
    bt.add(8);

    bt.preOrder(bt.root);
    System.out.println();
    bt.delete(8);
    bt.preOrder(bt.root);

  }
}