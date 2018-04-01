

import java.util.Stack;

public class PancakeSort {

	  
	  static void putBiggestToFrontAndSwap(int[] arr, int biggestNumIndex) {
	     if (biggestNumIndex <= arr.length -1) {
	       int temp = arr[0];
	       arr[0] = arr[biggestNumIndex];
	       arr[biggestNumIndex] = temp;
	     }
	  }
	  static void flip(int[] arr,int k) {
	    if (k <= arr.length - 1) {
	      Stack<Integer> stack = new Stack<>();
	      for (int i = 0; i <= k; i++) {
	        stack.push(arr[i]);
	      }
	      for (int i = 0; i <= k; i++) {
	        arr[i] = stack.pop();
	      }
	    }
	  }
	  static int[] pancakeSort(int[] arr) {
	    int endIndex = arr.length - 1;
	    int biggest = 0;
	    int biggestNumIndex = 0;
	    while (endIndex > 0) {
	      biggest = arr[0];
	      for (int i = 0; i <= endIndex; i++) {
	        if (arr[i] >= biggest) {
	           biggest = arr[i];
	           biggestNumIndex = i;
	        }
	      }
	      putBiggestToFrontAndSwap(arr, biggestNumIndex);
	      flip(arr, endIndex);
	      endIndex--;
	    }
	    return arr;
	  }


	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 2};
		System.out.println("before pancake sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\nafter  pancake sort");
		pancakeSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
