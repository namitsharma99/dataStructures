package test;

import java.util.Date;

public class InsertionSortTest {

  public static void main(String[] args) {

    int arr[] = { 5, 4, 14, 2, 8 };
    arr = insertionSort(arr);
    System.out.println(displayArray(arr));
  }

  public static int[] insertionSort(int[] arr) {

    long startTime = new Date().getTime();
    for (int i = 1; i < arr.length; i++) {
      System.out.println("For i = " + i + " : " + displayArray(arr));
      int toSortVal = arr[i];
      int j = i;
      while (j > 0 && arr[j - 1] > toSortVal) {
        arr[j] = arr[j - 1];
        j--;
        System.out.println(displayArray(arr));
      }
      arr[j] = toSortVal;
      System.out.println(displayArray(arr));
    }
    long endTime = new Date().getTime();
    long timeTaken = endTime-startTime;
    System.out.println("Time taken in ms : "+timeTaken);
    return arr;
  }

  public static String displayArray(int[] arr) {
    String str = new String();
    for (int i : arr) {
      str += i + " ";
    }
    return str += "\n";
  }
}
