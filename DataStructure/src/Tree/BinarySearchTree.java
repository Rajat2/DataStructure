package Tree;

import java.util.Stack;


public class BinarySearchTree {
	Tree_Node root;
	public BinarySearchTree(){
		root = null;
	}
	//For Inserting
	void insert(int data){
		root = insert(root,data);
	}
	Tree_Node insert(Tree_Node root,int data){
		if(root == null){
			root = new Tree_Node(data);
		}
		else if(root.getData()<=data){
			root.right = insert(root.right, data) ;
		}
		else{
			root.left = insert(root.left, data);
		}
		return root;
	}

	
	//For searching
	boolean search(int n){
		return search(root,n);
	}
	boolean search(Tree_Node root,int n){
		if(root == null)
			return false;
		
		if(root.getData() == n)
			return true;
		else if(root.getData()<n)
			return search(root.right,n);
		else
			return search(root.left,n);
		
	}
	
	//Check Empty
	boolean isEmpty(){
		return root==null;
	}
	
	//Check count
	int count(){
		return count(root);
	}
	
	int count(Tree_Node root){
		if(root == null)
			return 0;
		else{
			int l =1 ;
			 l += count(root.getLeft());
			 l += count(root.getRight());
			return l;
		}
	}
	//Height
	int getHeight(){
		return height(root);
	}
	int height(Tree_Node root){
		if(root==null)
			return 0;
		else
			return 1 + Math.max(height(root.left),height(root.right));
	}
	//levelorder
	void levelorder(){
		levelorder(root);
	}
	void levelorder(Tree_Node root){
		int height = getHeight();
		for(int i=1;i<=height;i++){
			levelorder(root, i);
		}
	}
	void levelorder(Tree_Node root,int level){
		if(root == null)
			return;
		else if(level==1)
			System.out.println(root.getData()+" , ");
		else if(level>1){
			levelorder(root.left, level-1);
			levelorder(root.right, level-1);
		}
				
	}
	
	//Inorder
	void inorder(){
		inorder(root);
	}
	static Stack<Integer> stack = new Stack<>();
	void inorder(Tree_Node root){
		if(root!=null){
			inorder(root.getLeft());
			//System.out.print(root.getData()+" , ");
			stack.push(root.getData());
			inorder(root.getRight());
		}
	}
	
	void p(){
		System.out.println(stack);
	}
	//Preorder
		void preorder(){
			preorder(root);
		}
		void preorder(Tree_Node root){
			if(root!=null){
				System.out.print(root.getData()+" , ");
				preorder(root.getLeft());
				preorder(root.getRight());
					
			}
		}
		
	//postorder
		void postorder(){
			postorder(root);
		}
		void postorder(Tree_Node root){
			if(root!=null){
				
				postorder(root.getLeft());
				postorder(root.getRight());
				System.out.print(root.getData()+" , ");
			}
		}
}

