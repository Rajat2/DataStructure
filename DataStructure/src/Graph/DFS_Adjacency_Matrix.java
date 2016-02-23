package Graph;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;


public class DFS_Adjacency_Matrix {
	public static void dfs(int adj[][],int N,int src){
		boolean visited[] = new boolean[N+1];
		Stack<Integer> stack = new Stack<>();
		visited[src] = true; 
		System.out.println("Visited: "+src);
		stack.push(src);
		int i = src;
		while(!stack.isEmpty()){
			int node = stack.peek();
			i = node;
			while(i<=N){
				
				if(adj[node][i]==1 && !visited[i]){
					stack.push(i);
					System.out.println("Stack after push  : "+ stack);
					System.out.println("Visited: "+i);
					visited[i] = true;
					node = i;
					i=1;
					continue;
				}
				i++;
			}
			stack.pop();
			System.out.println("Stack after pop  : "+ stack);
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
		dfs(adj,N,src);
		scan.close();
	}

}
