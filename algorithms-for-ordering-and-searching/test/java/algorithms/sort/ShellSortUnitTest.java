package test.java.algorithms.sort;

import main.java.algorithms.base.Result;
import main.java.algorithms.sort.ShellSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShellSortUnitTest {

  private ShellSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new ShellSort();
  }

  @Test
  public void shellSortTest() {
    System.out.println("Shell Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);
  }
}
