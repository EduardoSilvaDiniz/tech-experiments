package test.java.search;

import main.java.sort.BucketSort;
import org.junit.jupiter.api.Test;

public class BucketSortTest {

  @Test
  public void bucketSortTest() {
    float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
    BucketSort.bucketSort(arr);
  }
}
