package LinkedList;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
	Node(){
		this.data = 0;
		next=null;
	}
}
class Carry{
	int c;
}
public class Addition_Of_LinkedList {
	Node ans;
	void addition(Node first, Node second){
		int fsize = getSize(first);
		int ssize = getSize(second);
		if(fsize>ssize){
			int diff = fsize - ssize;
				while(diff>0){
					Node n= new Node(0);
					n.next = second;
					second = n;
					diff--;
				}
		}
		else if(fsize<ssize){
			int diff = fsize - ssize;
			while(diff>0){
				Node n= new Node(0);
				n.next = first;
				first = n;
				diff--;
			}
		}
		display(first);
		display(second);
		Carry c = new Carry();
		ans = addUsingRecursion(first,second,c);
		if(c.c!=0){
			Node t = new Node(c.c);
			t.next = ans;
			ans = t;
		}
		display(ans);
	}
	Node addUsingRecursion(Node f, Node s,Carry ca){
		
		int sum;
		Node temp = new Node();
		if(f==null && s==null)
			return null;
		temp.next = addUsingRecursion(f.next, s.next,ca);
		sum = f.data+s.data+ca.c;
		ca.c = sum/10;
		sum = sum%10;
		temp.data = sum;
		
		return temp;
	}
	int getSize(Node node){
		int size=0;
		while(node!=null){
			size++;
			node = node.next;
		}
		return size;
	}
	public void display(Node head){
		System.out.println();
		Node currNode = head;
		while(currNode!=null){
			System.out.print("->" + currNode.data);
			currNode=currNode.next;
		}		
	}
	public static void main(String[] args) {
		Node first = new Node(9);
		first.next = new Node(9);
		first.next.next = new Node(9);
		first.next.next.next = new Node(9);
		
		Node second = new Node(0);
		second.next = new Node(1);
		Addition_Of_LinkedList a = new Addition_Of_LinkedList();
		a.addition(first, second);
	}
}
