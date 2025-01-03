package com.experiments.algorithms.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.experiments.algorithms.sort.DefaultTest.bigListAndShowComparetionAndTime;
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
    bigListAndShowComparetionAndTime(sorter);

  }
}