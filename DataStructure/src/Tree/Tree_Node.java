package Tree;

public class Tree_Node {
	Tree_Node left,right;
	int data;
	
	public Tree_Node(){
		left= null;
		right=null;
		data=0;
	}
	public Tree_Node(int n){
		left = null;
		right=null;
		data = n;
				
	}
	 
 /* Function to set left node */
    public void setLeft(Tree_Node n){
    		left = n;
    	}
   
    /* Function to set right node */ 
    public void setRight(Tree_Node n){
        right = n;
    }

    /* Function to get left node */
    public Tree_Node getLeft(){
        return left;
    }
    /* Function to get right node */
    public Tree_Node getRight(){
        return right;
    }

    /* Function to set data to node */
    public void setData(int d) {
        data = d;
    }
    /* Function to get data from node */
    public int getData(){
        return data;
    } 

}
