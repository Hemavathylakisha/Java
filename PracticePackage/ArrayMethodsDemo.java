package PracticePackage;
import java.util.*;

public class ArrayMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {40, 10, 50, 20, 30};

	        System.out.println("Original: " + Arrays.toString(arr));

	        Arrays.sort(arr);
	        System.out.println("Sorted: " + Arrays.toString(arr));

	        int index = Arrays.binarySearch(arr, 30);
	        System.out.println("Index of 30: " + index);

	        int[] copy = Arrays.copyOf(arr, arr.length);
	        System.out.println("Copied array: " + Arrays.toString(copy));
	               
	        //Max and min
	        int max = arr[0];
	        int min = arr[0];

	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }

	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);
	        
	        //LinearSearch
	        int key = 12;
	        boolean found = false;

	        for (int num : arr) {
	            if (num == key) {
	                found = true;
	                break;
	            }
	        }

	        System.out.println(found ? "Found" : "Not Found");
	}

}
