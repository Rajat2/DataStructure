package Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void doSorting(int array[]){
		System.out.println("Before Sorting");
		printNumbers(array);
		for(int i=0;i<array.length;i++){
			int pos = i;
			for(int j=i+1;j<array.length;j++){
				if(array[pos]>array[j])
					pos = j;
			}
			if(pos!=i){
			int temp = array[i];
			array[i] = array[pos];
			array[pos] = temp;
			}
			System.out.println("Pass"+(i+1));
			printNumbers(array);
		}
	}
	public static void printNumbers(int []a){
		 System.out.println(Arrays.toString(a));
	 }
	 public static void main(String[] args) {
		 int array[] = {-90,-90,100,90,80,70,60,60,60,60,-100,0};
		 doSorting(array);
	 }
}
