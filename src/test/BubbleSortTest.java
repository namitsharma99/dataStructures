package test;

import java.util.Date;

public class BubbleSortTest {

  public static void main(String[] args) {

    int arr[] = { 5, 4, 14, 2, 8 };
    arr = bubbleSort(arr);
    System.out.println(displayArray(arr));
  }

  public static int[] bubbleSort(int[] arr) {
    
    long startTime = new Date().getTime();

    for (int i=0; i<arr.length; i++){
      for (int j=1; j<arr.length-i;j++){
        System.out.println("This is for i="+i+",j="+j+" : "+displayArray(arr));
        if (arr[j] < arr[j-1]) {
          System.out.print("If condition satisfied -- ");
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          System.out.println(" Post swapping : "+displayArray(arr));
        }
      }
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
