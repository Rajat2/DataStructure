package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Adjacency_Matrix {
	
	public static void bfs(int adj[][],int N,int src){
		boolean visited[] = new boolean[N+1];
		Queue<Integer> queue = new LinkedList<>();
		visited[src] = true; 
		System.out.println("                            Visited: "+src);
		queue.add(src);
		int i = src;
		while(!queue.isEmpty()){
			int node = queue.peek();
			//System.out.println("Node: "+node);
			i = 0;
			while(i<=N){
				if(adj[node][i]==1 && !visited[i]){
					queue.add(i);
					System.out.println("Queue after push  : "+ queue);
					System.out.println("                      Visited: "+i);
					visited[i] = true;
					node = i;
					i=1;
					continue;
				}
				i++;
			}
			queue.poll();
			System.out.println("Queue after pop  : "+ queue);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Vertex");
		int N = scan.nextInt();
		System.out.println("Enter the matrix");
		int adj[][] = new int[N+1][N+1];
		for(int i=1;i<=N;i++)
			for(int j=1;j<=N;j++)
				adj[i][j]=scan.nextInt();
		System.out.println("Enter src");
		int src = scan.nextInt();
		bfs(adj,N,src);
		scan.close();
	}

}
