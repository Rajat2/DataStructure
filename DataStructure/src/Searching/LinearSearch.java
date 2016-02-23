package Searching;


public class LinearSearch {
	static void search(int a[],int src){
		for(int i=0;i<a.length;i++){
			if(a[i]==src)
				System.out.println(src+" is present on "+(i+1)+" position.");
		}
	}
	public static void main(String[] args) {
		int array[] = {10,20,30,90,70,100,80,90,100,90,80,17};
		int src = 90;
		search(array, src);
	}

}
