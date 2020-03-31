package tyj.sort;

public class InsertionSort {
  public static void main(String[] args) {
    int[] test = { 3, 2, 1, 5, 4, 7, 9, 8, 10, 11 };
    InsertionSort.sort(test);
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  /**
   * 插入排序 时间O(n*n) 空间O(n*n)
   * 
   * @param arr
   */
  public static void sort(int[] arr) {
    for (int i = 1, len = arr.length; i < len; i++) {
      int j = i - 1;
      int cur = arr[i];
      while (j >= 0 && arr[j] > cur) {
        arr[j + 1] = arr[j--];
      }
      arr[j + 1] = cur;
    }
  }
}