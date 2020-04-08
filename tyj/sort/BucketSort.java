package tyj.sort;

public class BucketSort {
  public static void main(String[] args) {
    int[] test = { 3, 2, 1, 5, 4, 7, 9, 8, 10, 11, 1, 2 };
    BucketSort.sort(test);
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  public static void sort(int[] arr) {
    if (arr == null || arr.length == 0)
      return;
    
  }
}
