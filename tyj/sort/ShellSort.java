package tyj.sort;

public class ShellSort {
  public static void main(String[] args) {
    int[] test = { 3, 2, 1, 5, 4, 7, 9, 8 };
    ShellSort.sort(test);
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  /**
   * 希尔排序 平均时间小于O(n*n) 空间O(1)
   * 
   * @param arr
   */
  public static void sort(int[] arr) {
    for (int gap = arr.length >> 1; gap > 0; gap = gap >> 1) {
      for (int i = gap, len = arr.length; i < len; i++) {
        int j = i;
        int cur = arr[i];
        while (j - gap >= 0 && arr[j - gap] > cur) {
          arr[j] = arr[j - gap];
          j = j - gap;
        }
        arr[j] = cur;
      }
    }
  }
}