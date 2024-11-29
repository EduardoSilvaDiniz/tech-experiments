package main.java.sort;

public class MergeSort {
  public static void sort(int[] listToOrder) {
    int length = listToOrder.length;
    if (length < 2)
      return;
    int mid = length / 2;
    int[] l = new int[mid];
    int[] r = new int[length - mid];

    System.arraycopy(listToOrder, 0, l, 0, mid);
    if (length - mid >= 0) System.arraycopy(listToOrder, mid, r, 0, length - mid);
    sort(l, mid);
    sort(r, length - mid);

    merge(listToOrder, l, r, mid, length - mid);
  }

  private static void sort(int[] listToOrder, int length) {
    if (length < 2)
      return;
    int mid = length / 2;
    int[] l = new int[mid];
    int[] r = new int[length - mid];

    System.arraycopy(listToOrder, 0, l, 0, mid);

    if (length - mid >= 0) System.arraycopy(listToOrder, mid, r, 0, length - mid);

    sort(l, mid);
    sort(r, length - mid);

    merge(listToOrder, l, r, mid, length - mid);
  }

  public static void merge(int[] a, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0, k = 0;

    while (i < left && j < right) {
      if (l[i] <= r[j])
        a[k++] = l[i++];
      else
        a[k++] = r[j++];
    }

    while (i < left)
      a[k++] = l[i++];

    while (j < right)
      a[k++] = r[j++];
  }
}
