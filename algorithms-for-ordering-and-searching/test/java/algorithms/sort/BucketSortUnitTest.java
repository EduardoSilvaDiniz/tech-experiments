package test.java.algorithms.sort;

import main.java.algorithms.base.GenerateList;
import main.java.algorithms.base.Result;
import main.java.algorithms.sort.BucketSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BucketSortUnitTest {
  private BucketSort sorter;

  @BeforeEach
  public void setUp() {
    sorter = new BucketSort();
  }

  @Test
  void givenUnsortedList_whenSortedUsingBucketSorter_checkSortingCorrect() {

    System.out.println("Bucket Sort");
    DefaultTest.bigListAndShowComparetionAndTime(sorter);

  }
}