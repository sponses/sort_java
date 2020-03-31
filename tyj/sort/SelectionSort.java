package tyj.sort;

public class SelectionSort {
  public static void main(String[] args) {
    int[] test = { 3, 2, 1, 5, 4, 7, 9, 8, 10, 11 };
    SelectionSort.sort(test);
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  /**
   * 选择排序 平均时间O(n*n) 空间O(1)
   * 
   * @param arr
   */
  public static void sort(int[] arr) {
    for (int i = 0, len = arr.length; i < len - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < len; j++) {
        if (arr[minIndex] > arr[j])
          minIndex = j;
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
}