package LinkedList;


public class Linked_List {
	private LinkedListNode start;
	private int size;
	public Linked_List() {
		// TODO Auto-generated constructor stub
		start = null;
		size = 0;
	}
	public void insertAtEnd(int data){
		LinkedListNode node = new LinkedListNode(data, null);
		size++;
		if(start==null){
			start = node;
		}
		else{
			LinkedListNode temp = start;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	protected void reverseLinkedList(){
		LinkedListNode prev = null;
		LinkedListNode curr = start;
		LinkedListNode next;
		
		while(curr!=null ){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		start = prev;
	}
	
	protected boolean isEmpty(){
		return start== null;
	}
	private int size(){
		return size;
	}
	protected void print(){
		System.out.println("Size of linked list is: "+size() );
		System.out.println("Start node:"+ start.node);
		LinkedListNode temp = start;
		while(temp.next!=null){
			temp = temp.next;
			System.out.println(temp.node);
		}
	}
}
