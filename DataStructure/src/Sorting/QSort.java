package Sorting;
public class QSort {
	static int A[] = {-50,-50,34,30,-34,-200,-10,-90};
	public static void QSort(int[] A,int left,int right){
		int pivot = A[(left+right)/2];
		//print();
		System.out.println(" Pivot is: "+pivot);
		int i=left;
		int j=right;
		while(i<=j){	
		while(A[i]<pivot)
			i++;
		while(A[j]>pivot)
			j--;
		if(i<=j){
			swap(i,j);
			i++;
			j--;
		}
		}
		if(left<j){
			System.out.println("Call-1");
			QSort(A, left, j);
		}
		if(right>i){
			System.out.println("Call-2");
			QSort(A, i, right);
		}	
		System.out.println("Final");
		print();
	}
	public static void swap(int i,int j){
		int temp;
		System.out.println("Swap : "+A[i]+"---->"+A[j]);
		temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static void print(){
		
		for(int i=0;i<A.length;i++)
			System.out.print(" "+A[i]);
		
		System.out.println();
	}
	public static void main(String[] args) {
		QSort(A,0,A.length-1);
	}
}
