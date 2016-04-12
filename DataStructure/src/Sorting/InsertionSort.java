package Sorting;

import java.util.Arrays;

public class InsertionSort {
	 public static void insertionSort(int array[]) {
	        int n = array.length;
	        for (int j = 1; j < n; j++) {
	        	System.out.println();
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) ) {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	            printNumbers(array);
	        }
	    }
	 public static void printNumbers(int []a){
			 System.out.print(Arrays.toString(a));
	 }
	 public static void main(String[] args) {
		 int array[] = {50,40,30,20,90};
		insertionSort(array);
	}
}
