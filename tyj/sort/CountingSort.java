package tyj.sort;

public class CountingSort {
  public static void main(String[] args) {
    int[] test = { 3, 2, 1, 5, 4, 7, 9, 8, 10, 11, 1, 2 };
    CountingSort.sort(test, CountingSort.getMax(test));
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  /**
   * 计数排序 时间复杂度O(n+k) 空间复杂度O(n+k)
   * 
   * @param arr
   * @param max
   */
  public static void sort(int[] arr, int max) {
    int[] temp = new int[max + 1];
    for (int i = 0, len = arr.length; i < len; i++) {
      temp[arr[i]]++;
    }
    int j = 0;
    for (int i = 0, len = max + 1; i < len; i++) {
      while (temp[i] > 0) {
        arr[j++] = i;
        temp[i]--;
      }
    }
  }

  /**
   * 获取数组中最大值
   * 
   * @param arr
   * @return
   */
  public static int getMax(int[] arr) {
    if (arr == null || arr.length == 0)
      return 0;
    int ans = arr[0];
    for (int i = 1, len = arr.length; i < len; i++) {
      if (arr[i] > ans)
        ans = arr[i];
    }
    return ans;
  }
}