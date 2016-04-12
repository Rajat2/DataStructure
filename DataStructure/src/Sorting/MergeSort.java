package Sorting;

import java.util.Arrays;



public class MergeSort {
	
	  void mergeSort(int A[],int l,int h){
		  if(l<h){
			  int m =  l+(h-l)/2;
			  mergeSort(A, l,m);
			  mergeSort(A, m+1, h);
			  doMergeSort(A,l,m,h);
		  }
	 }
	 void doMergeSort(int A[],int l,int m,int h){
		 int temp[] = new int[A.length];
		 for(int i=l;i<=h;i++)
			 temp[i] = A[i];
		 int i = l;
		 int j = m+1;
		 int k = l;
		 while(i<=m && j<=h){
			 if(temp[i]<=temp[j])
				 A[k] = temp[i++];
			 else
				 A[k] = temp[j++];
			 k++;
		 }
		 while(i<=m){
			 A[k]= temp[i];
			 i++;
			 k++;
		 }
		 print(A);
	 }
	 void print(int []A){
		 System.out.println(Arrays.toString(A));
	 }

	 public static void main(String[] args) {
		MergeSort m = new MergeSort();
		 int array[] = {-90,-90,-100,-90,-80,-70,-60,-60,-60,-60,-100,-0};
		 m.mergeSort(array, 0, array.length-1);
	}
}
