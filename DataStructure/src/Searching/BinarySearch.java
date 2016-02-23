package Searching;

public class BinarySearch {
	static int search(int a[],int src,int low,int high){
		int mid = (low+high)/2;
		if(low<high){
		if(a[mid]>src)
			return search(a, src, low, mid-1);
		else if(src>a[mid])
			return search(a, src, mid+1, high);
		else{
			System.out.println(src+" is present on "+(mid+1)+" position.");
			return mid+1;
		}
		}
		System.out.println("Not found");
		return -(low+1);
	}
	
	static void search(int a[],int src){
		System.out.println("-Binary Search with loop-");
		int low=0;
		int high = a.length;
		boolean flag = true;
		while(low<high){
			int mid = low+(high-low)/2;
			if(a[mid] == src){
				System.out.println(src+" is present on "+(mid+1)+" position.");
				flag = false;
				break;
			}
			else if(a[mid]<src){
				low = mid+1;
			}
			else{
				high = mid-1;
			}	
		}
		if(flag)
			System.out.println("Not found");
	}
	public static void main(String[] args) {
		int array[] = {2,20,30,40,40,40,50,60,70,80,90,100};
		int src = 10;
		System.out.println("-Binary Search with recursion-");
		search(array, src,0,array.length);
		search(array, src);
	}
}
