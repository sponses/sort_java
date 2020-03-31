package tyj.sort;

public class MergeSort {
  public static void main(String[] args) {
    int[] test = { 1, 2, 5, 3, 4, 6, 7 };
    MergeSort.sort(test);
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  public static void sort(int[] arr) {
    int[] temp = new int[arr.length];
    sort(arr, 0, arr.length - 1, temp);
  }

  public static void sort(int[] arr, int left, int right, int[] temp) {
    if (left < right) {
      int mid = (left + right) >> 1;
      sort(arr, left, mid, temp);
      sort(arr, mid + 1, right, temp);
      merge(arr, left, mid, right, temp);
    }
  }

  public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
    int l = left;
    int r = mid + 1;
    int t = 0;
    while (l <= mid && r <= right) {
      if (arr[l] < arr[r]) {
        temp[t++] = arr[l++];
      } else {
        temp[t++] = arr[r++];
      }
    }
    while (l <= mid)
      temp[l++] = arr[t++];
    while (r <= right)
      temp[r++] = arr[t++];
    t = 0;
    while (left <= right)
      arr[left++] = temp[t++];
  }
}