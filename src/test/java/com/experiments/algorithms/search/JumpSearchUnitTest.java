package com.experiments.algorithms.search;

import com.experiments.algorithms.search.JumpSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class JumpSearchUnitTest {
  private JumpSearch searched;

  @BeforeEach
  public void setUp() {
    searched = new JumpSearch();
  }

  @Test
  public void jumpSearchTest() {
    List<Integer> list = Arrays.asList(0,10,15,20,30,40,50,60,70,80,200,500,600,602);

    for (int i = 0; i < list.size(); i++)
      Assertions.assertEquals(i, searched.search(list, list.get(i)).list.getFirst());

  }
}