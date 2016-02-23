package Graph;

import java.util.Scanner;

public class TestGraph {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of nodes");
		int num = scan.nextInt();
		Graph g = new Graph(num);
		System.out.println("Press 1 to continue");
		System.out.println("Enter edge details (Source Destination) Eg: 1 2");
		do{
			String src = scan.next();
			String dest = scan.next();
			g.addUndirectedEdge(src, dest);
		}while(scan.nextInt()==1);
		System.out.println("Graph");
		g.printGraph();
		scan.close();
	}
}