package Tree;

class Node{
	int data;
	Node left,right;
	Node(int num){
		data = num;
		left = right=null;
	}
}


public class Different_View_Of_BT {
	Node root;
	int max_level = 0;
	int max_level_right = 0;
					//Left View
					void leftView(){
						leftView(root, 1);
					}
					void leftView(Node root,int level){
						if(root==null)
							return;
						if(max_level < level){
							System.out.print(root.data+", ");
							max_level = level;
						}
						
						leftView(root.left, level+1);
						leftView(root.right, level+1);
					}
					
			//Rigth View
			void rigthView(){
				System.out.println();
				rightView(root,1);
			}
			void rightView(Node root,int level){
				if(root==null)
					return;
				if(max_level_right < level){
					System.out.print(root.data+", ");
					max_level_right = level;
				}
				rightView(root.right, level+1);
				rightView(root.left, level+1);
			}
	public static void main(String[] args) {
		Different_View_Of_BT tree = new Different_View_Of_BT();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.leftView();
        tree.rigthView();
	}
	
}
