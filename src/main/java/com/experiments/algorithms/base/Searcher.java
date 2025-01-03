package com.experiments.algorithms.base;

import com.experiments.algorithms.base.Result;

import java.util.List;

public interface Searcher {
  public Result search(List<Integer> list, int target);
}
