package Heap;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MaxHeap {
	int size;
	int heap[];
	public MaxHeap(int s) {
		// TODO Auto-generated constructor stub
		size = 0;
		heap = new int[s];
	}
	private boolean isEmpty(){
		return size==0;
	}
	
	private boolean isFull(){
		return size == heap.length;
	}
	private boolean isLeaf(int pos){
		return leftChild(pos) >= size;
	}
    private int leftChild(int pos)    {
        return (2 * pos)+1;
    }
    private int rightChild(int pos){
        return (2 * pos) + 2;
    }
    private void swap(int x,int y){
		int t = heap[x];
		heap[x] = heap[y];
		heap[y] = t;
	}
    private int parent(int index){
		return (int)Math.floor(index-1)/2;
	}
    
    public void insert(int val){
    	if(isFull()){
			throw new NoSuchElementException("Heap Overflow");
		}
		heap[size++] = val;
		heapifyUp(size-1);
    }
    private void heapifyUp(int index){
		System.out.println("After Adding : "+heap[index]);
		while(heap[index] > heap[parent(index)]){
			swap(index, parent(index));
			index = parent(index);
		}
		printHeap();
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
    
    private void heapifyDown(int index){
		if(!isLeaf(index)){
			int next;
			if(heap[leftChild(index)]>heap[rightChild(index)])
				next = leftChild(index);
			else
				next = rightChild(index);
			System.out.println("next is :"+ next);
			if(heap[next]>heap[index]){
				swap(next, index);
				heapifyDown(next);
			}
		}
	}
    private void printHeap(){
		System.out.println(Arrays.toString(heap));
		System.out.println("------------------------------------------------");
	}
}
