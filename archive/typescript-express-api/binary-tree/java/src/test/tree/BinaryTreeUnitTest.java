package test.tree;

import main.java.com.tree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeUnitTest {

  @Test
  public void givenABinaryTree_WhenAddingElements_TheTreeContainsThoseElements() {
    BinaryTree bt = createBinaryTree();

    assertTrue(bt.containsNode(6));
    assertTrue(bt.containsNode(7));

    assertFalse(bt.containsNode(1));
  }

  @Test
  public void givenABinaryTree_WhenTraversingLevelOrder_ThenPrintValues() {
    BinaryTree bt = createBinaryTree();
    bt.traverseLevelOrder();
  }

  private BinaryTree createBinaryTree() {
    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    return bt;
  }
}
