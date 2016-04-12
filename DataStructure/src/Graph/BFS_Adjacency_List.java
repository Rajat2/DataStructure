package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Adjacency_List {
	private int total_vertex;
	public LinkedList<Integer> nodes[];
	public boolean visited[];
	BFS_Adjacency_List(int vertex){
		total_vertex = vertex;
		nodes = new LinkedList[total_vertex];
		visited = new boolean[total_vertex];
		for(int i=0;i<total_vertex;i++)
			nodes[i] = new LinkedList<>();
	}
	
	public void addEdge(int src,int des){
		nodes[src].add(des);
	}
	
	public void BFS(int src){
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		visited[src] = true;
		while(!queue.isEmpty()){
			src = queue.poll();
			System.out.println("Visited: " + src);
			Iterator<Integer> i = nodes[src].iterator();
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}	
			System.out.println(queue);
		}
		
	}
	
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter number of Vertex");
		//int N = scan.nextInt();
		int N = 7;
		BFS_Adjacency_List bfs = new BFS_Adjacency_List(N);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 3);
		bfs.addEdge(2, 5);
		bfs.addEdge(2, 6);
		bfs.addEdge(1, 4);
		bfs.BFS(1);
		//scan.close();
	}

}
 