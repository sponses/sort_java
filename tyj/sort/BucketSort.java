package tyj.sort;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
  public static void main(String[] args) {
    int[] test = { 1, 8, 11, 9, 20 };
    BucketSort.sort(test);
    for (int i = 0, len = test.length; i < len; i++) {
      System.out.print(test[i]);
    }
  }

  public static void sort(int[] arr) {
    if (arr == null || arr.length == 0)
      return;
    int min = arr[0];
    int max = arr[0];
    for (int i = 0, len = arr.length; i < len; i++) {
      min = Math.min(min, arr[i]);
      max = Math.max(max, arr[i]);
    }
    int bucket_size = (max - min) / arr.length + 1;
    ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucket_size);
    for (int i = 0; i < bucket_size; i++) {
      buckets.add(new ArrayList<>());
    }
    for (int i = 0, len = arr.length; i < len; i++) {
      buckets.get((arr[i] - min) / arr.length).add(arr[i]);
    }
    int n = 0;
    for (int i = 0; i < bucket_size; i++) {
      Collections.sort(buckets.get(i));
      for (int j = 0, len = buckets.get(i).size(); j < len; j++) {
        arr[n++] = buckets.get(i).get(j);
      }
    }
  }
}
