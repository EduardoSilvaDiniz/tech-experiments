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
}
