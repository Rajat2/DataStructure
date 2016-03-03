package Heap;


public class Test {
	public static void main(String[] args) {
		//Min Heap
		System.out.println("Min Heap");
		try{
		MinHeap heap = new MinHeap(10);
		heap.insert(20);
		heap.insert(10);
		heap.insert(30);
		heap.insert(50);
		heap.insert(40);
		heap.insert(60);
		heap.insert(70);
		heap.insert(90);
		heap.insert(80);
		
		heap.delete(0);
		heap.delete(7);
		heap.delete(1);}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Max Heap");
		//Max Heap
		try{
			MaxHeap heap = new MaxHeap(10);
			heap.insert(20);
			heap.insert(10);
			heap.insert(30);
			heap.insert(50);
			heap.insert(40);
			heap.insert(60);
			heap.insert(70);
			heap.insert(90);
			heap.insert(80);
			
			heap.delete(0);
			heap.delete(7);
			heap.delete(1);}
			catch(Exception e){
				e.printStackTrace();
			}
	}
}
