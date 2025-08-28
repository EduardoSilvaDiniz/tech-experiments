public class MyResult {
  public Integer mediaDaList(List<Integer> list) {
    List<Integer> myList = new ArrayList<>();
    var count = 0;

    for (Integer value : list) {

      Integer mid = myList.stream().mapToInt(Integer::intValue).average().orElse(0);

      if (value > mid) count++;
      myList.add(value);
    }
    return count;
  }

  public static List<Integer> compareceTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> result = new ArrayList<>();
    result.add(0);
    result.add(0);

    IntStream.range(0, a.size())
        .forEach(
            i -> {
              int valA = a.get(i);
              int valB = b.get(i);

              if (valA > valB) result.set(0, result.get(0) + 1);
              else if (valB > valA) result.set(1, result.get(1) + 1);
            });
    return result;
  }

  public static Long aVeryBigSum(List<Long> ar) {
    return ar.stream().reduce(0L, Long::sum);
  }

  public static int diagonalDifference(List<List<Integer>> arr) {
    List<Integer> result = new ArrayList<>();
    result.add(0);
    result.add(0);

    arr.stream().forEach(System.out::println);
    IntStream.range(0, 3)
        .forEach(
            i -> {
              result.set(0, result.get(0) + arr.get(i).get(i));
            });

    IntStream.range(0, 3)
        .forEach(
            i -> {
              result.set(1, result.get(1) + arr.get(i).get((arr.get(i).size() - 1) - i));
            });

    return Math.abs(result.get(0) - result.get(1));
  }
	 public int formingMagicSquare(List<List<Integer>> s) {
	 List<List<List<Integer>>> cubeMagics = new ArrayList<>();

    cubeMagics.add(Arrays.asList(
        Arrays.asList(8, 1, 6),
        Arrays.asList(3, 5, 7),
        Arrays.asList(4, 9, 2)
    ));

    cubeMagics.add(Arrays.asList(
        Arrays.asList(6, 1, 8),
        Arrays.asList(7, 5, 3),
        Arrays.asList(2, 9, 4)
    ));

    cubeMagics.add(Arrays.asList(
        Arrays.asList(4, 9, 2),
        Arrays.asList(3, 5, 7),
        Arrays.asList(8, 1, 6)
    ));

    cubeMagics.add(Arrays.asList(
        Arrays.asList(2, 9, 4),
        Arrays.asList(7, 5, 3),
        Arrays.asList(6, 1, 8)
    ));

    cubeMagics.add(Arrays.asList(
        Arrays.asList(8, 3, 4),
        Arrays.asList(1, 5, 9),
        Arrays.asList(6, 7, 2)
    ));

    cubeMagics.add(Arrays.asList(
        Arrays.asList(4, 3, 8),
        Arrays.asList(9, 5, 1),
        Arrays.asList(2, 7, 6)
    ));

    cubeMagics.add(Arrays.asList(
        Arrays.asList(6, 7, 2),
        Arrays.asList(1, 5, 9),
        Arrays.asList(8, 3, 4)
    ));

    cubeMagics.add(Arrays.asList(
        Arrays.asList(2, 7, 6),
        Arrays.asList(9, 5, 1),
        Arrays.asList(4, 3, 8)
    ));

    int minimumCost = Integer.MAX_VALUE;

    for (List<List<Integer>> magic : cubeMagics) {
      int currentCost = 0;

      for (int i = 0; i < s.size(); i++) {
        for (int j = 0; j < s.get(i).size(); j++) {
          int original = s.get(i).get(j);
          int target = magic.get(i).get(j);
          currentCost += Math.abs(original - target);
        }
      }

      minimumCost = Math.min(minimumCost, currentCost);
    }
    return minimumCost;
  }
}
