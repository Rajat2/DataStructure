package LinkedList;


public class LinkedListTest {
	public static void main(String[] args) {
		
		Linked_List list = new Linked_List();
		int a[] = {1,2,3,4,5};
		for(int i=0;i<a.length;i++){
			list.insertAtEnd(a[i]);
		}
		list.print();
		list.reverseLinkedList();
		list.print();
	}
}
