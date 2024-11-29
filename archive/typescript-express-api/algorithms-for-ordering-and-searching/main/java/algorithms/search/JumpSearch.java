package main.java.algorithms.search;

import main.java.algorithms.base.Result;
import main.java.algorithms.base.SearchAlgorithm;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;

public class JumpSearch extends SearchAlgorithm {
  @Override
  public Result search(int[] list, int value) {
    int length = list.length;

    int step = (int) Math.floor(Math.sqrt(length));

    int prev = 0;
    for (int minStep = Math.min(step, length) - 1; list[minStep] < value; minStep = Math.min(step, length) - 1) {
      prev = step;
      step += (int) Math.floor(Math.sqrt(length));
      if (prev >= length)
        throw new ArgumentAccessException("Value not found");
    }

    while (list[prev] < value) {
      prev++;

      if (prev == Math.min(step, length))
      throw new ArgumentAccessException("Value not found");
    }

    //if (list[prev] == value)
      //return prev;

    throw new IllegalArgumentException("Value not found");
  }
}