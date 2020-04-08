package tyj.sort;

public class QuickSort {
  public static void main(String[] args) {
    int[] test = { 1, 9, 3, 4, 5, 6, 2, 7, 8, 11, 1, 2, 3, 3, 3, 4 };
    QuickSort.sort(0, test.length - 1, test);
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  /**
   * 快速排序 平均时间复杂度O(nlogn) 空间O(nlogn)
   *
   * @param arr
   * @param l
   * @param r
   */
  public static void sort(int l, int r, int[] arr) {
    if (l >= r)
      return;
    int base = arr[l];
    int i = l;
    int j = r;
    int n = l + 1;
    while (n <= j) {
      if (arr[n] < base) {
        arr[i++] = arr[n++];
      } else {
        int temp = arr[n];
        arr[n] = arr[j];
        arr[j--] = temp;
      }
    }
    arr[i] = base;
    QuickSort.sort(l, i - 1, arr);
    QuickSort.sort(i + 1, r, arr);
  }
}