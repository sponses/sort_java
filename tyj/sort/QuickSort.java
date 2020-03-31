package tyj.sort;

public class QuickSort {
  public static void main(String[] args) {
    int[] test = { 1, 9, 3, 4, 5, 6, 2, 7, 8 };
    QuickSort.sort(test, 0, test.length - 1);
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
  public static void sort(int[] arr, int l, int r) {
    if (l >= r)
      return;
    int key = arr[l];
    int i = l;
    int j = r;
    while (i < j) {
      while (arr[j] > key)
        j--;
      if (i < j) {
        arr[i] = arr[j];
        i++;
      }
      while (i < j && arr[i] < key)
        i++;
      if (i < j) {
        arr[j] = arr[i];
        i++;
      }
    }
    arr[i] = key;
    QuickSort.sort(arr, l, i - 1);
    QuickSort.sort(arr, i + 1, r);
  }
}