package Heap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinHeap {
	int size;
	int heap[];
	public MinHeap(int s) {
		// TODO Auto-generated constructor stub
		size = 0;
		heap = new int[s];
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public boolean isFull(){
		return size == heap.length;
	}
	
	public void insert(int value){
		if(isFull()){
			throw new NoSuchElementException("Heap Overflow");
		}
		
		heap[size++] = value;
		heapifyUp(size-1);
		
	}
	public void delete(int index){
		if(isEmpty() || index>=size)
			throw new NoSuchElementException("Heap Underflow");
		System.out.println("After Deleting : "+heap[index] );
		heap[index] = heap[size-1];
		heap[size-1] = 0;
		size--;
		heapifyDown(index);
		printHeap();
	}
	public boolean isLeaf(int pos){
		return leftChild(pos) >= size;
	}
    private int leftChild(int pos)    {
        return (2 * pos)+1;
    }
    private int rightChild(int pos){
        return (2 * pos) + 2;
    }
	
	public void swap(int x,int y){
		int t = heap[x];
		heap[x] = heap[y];
		heap[y] = t;
	}
	public void heapifyUp(int index){
		System.out.println("After Adding : "+heap[index]);
		while(heap[index] < heap[parent(index)]){
			swap(index, parent(index));
			index = parent(index);
		}
		printHeap();
	}
	
	public void heapifyDown(int index){
		if(!isLeaf(index)){
			int next;
			if(heap[leftChild(index)]<heap[rightChild(index)])
				next = leftChild(index);
			else
				next = rightChild(index);
			System.out.println("next is :"+ next);
			if(heap[next]<heap[index]){
				swap(next, index);
				heapifyDown(next);
			}
		}
	}
	private int parent(int index){
		return (int)Math.floor(index-1)/2;
	}
	public void printHeap(){
		System.out.println(Arrays.toString(heap));
		System.out.println("------------------------------------------------");
	}

}
