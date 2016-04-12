package LinkedList;


public class LinkedListReverse {
	
	Node reverse(Node node){
		Node curr = node;
		Node next = null;
		Node prev = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	Node reverse(Node node,int k){
		Node curr = node;
		Node next = null;
		Node prev = null;
		int count=0;
		while(count<k && curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}
		if(next!=null)
			node.next  = reverse(next,k);
		
		return prev;
	}
	static void display(Node ans){
		System.out.println();
		while(ans!=null){
			System.out.print(ans.data+" ");
			ans = ans.next;
		}
	}
	public static void main(String[] args) {
		Node first = new Node(1);
		first.next = new Node(2);
		first.next.next = new Node(3);
		first.next.next.next = new Node(4);
		first.next.next.next.next = new Node(5);
		first.next.next.next.next.next = new Node(6);
		first.next.next.next.next.next.next = new Node(7);
		first.next.next.next.next.next.next.next = new Node(8);
		
		Node ans = new LinkedListReverse().reverse(first,3);
		display(ans);
	}
}
