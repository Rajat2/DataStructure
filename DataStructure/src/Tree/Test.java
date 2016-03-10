package Tree;

import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Binary Search Tree");
		BinarySearchTree bst = new BinarySearchTree();
		 char ch;        
	        do    
	        {
	            System.out.println("Binary Tree Operations");
	            System.out.println("1. insert ");
	            System.out.println("2. search");
	            System.out.println("3. count nodes");
	            System.out.println("4. check empty");
	            System.out.println("5. Height");
	            int choice = scan.nextInt();            
	            switch (choice)
	            {
	            case 1 : 
	                System.out.print("Enter integer element to insert");
	                bst.insert( scan.nextInt() );                     
	                break;                          
	            case 2 : 
	                System.out.print("Enter integer element to search");
	                System.out.println("Search result : "+ bst.search(scan.nextInt() ));
	                break;                                          
	            case 3 : 
	                System.out.print("Nodes = "+ bst.count());
	                break;     
	            case 4 : 
	                System.out.print("Empty status = "+ bst.isEmpty());
	                break;            
	            case 5:
	            	System.out.println("Height is: "+ bst.getHeight());
	            	break;
	            case 6:
	            	bst.inorder();
	            	bst.p();
	            	break;
	            default : 
	                System.out.print("Wrong Entry \n ");
	                break;   
	            }
	            System.out.print("\nPost order : ");
	            bst.postorder();
	            System.out.print("\nPre order : ");
	            bst.preorder();
	            //System.out.print("\nIn order : ");
	            //bst.inorder();
	            System.out.print("\nLevel order : ");
	            bst.levelorder();
	            
	            System.out.println("\n\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0); 
	        }while (ch == 'Y'|| ch == 'y');  
	        
	        scan.close();
	}
	
}
