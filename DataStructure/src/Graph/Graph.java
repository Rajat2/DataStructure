package Graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Graph {
	private LinkedHashMap<String,List<String>> node;
	public Graph(int num){
		node = new LinkedHashMap<String,List<String>>(num);
	}
	public void addUndirectedEdge(String src1,String src2){
		List<String> edges1 = node.get(src1);
		List<String> edges2 = node.get(src2);
		if(edges1==null){
			node.put(src1, edges1 = new ArrayList<String>(2));
		}
		if(edges2==null){
			node.put(src2, edges2 = new ArrayList<String>(2));
		}
		edges1.add(src2);
		edges2.add(src1);
	}
	public void printGraph(){
		for(String key: node.keySet()){
			System.out.print(key+":  ");
			for(String edges: node.get(key) ){
				System.out.print(edges+", ");
			}
			System.out.println();
		}
	}
}	
	