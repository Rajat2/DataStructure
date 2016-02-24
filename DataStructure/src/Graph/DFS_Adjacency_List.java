package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS_Adjacency_List {
	private int total_vertex;
	public LinkedList<Integer> nodes[];
	public boolean visited[];
	DFS_Adjacency_List(int vertex){
		total_vertex = vertex;
		nodes = new LinkedList[total_vertex];
		visited = new boolean[total_vertex];
		for(int i=0;i<total_vertex;i++)
			nodes[i] = new LinkedList<>();
	}
	
	public void addEdge(int src,int des){
		nodes[src].add(des);
	}
	
	public void DFS(int src){
		visited[src] = true;
		System.out.print(src+" , ");
		Iterator<Integer> i = nodes[src].iterator();
		while(i.hasNext()){
			int n = i.next();
			if(!visited[n])
				DFS(n);
		}
	}
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter number of Vertex");
		//int N = scan.nextInt();
		int N = 7;
		DFS_Adjacency_List dfs = new DFS_Adjacency_List(N);
		dfs.addEdge(1, 4);
		dfs.addEdge(1, 2);
		dfs.addEdge(4, 5);
		dfs.addEdge(4, 6);
		dfs.addEdge(6, 3);
		dfs.DFS(1);
		//scan.close();
	}
}
