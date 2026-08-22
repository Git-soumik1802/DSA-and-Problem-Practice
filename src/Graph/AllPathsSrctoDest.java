package Graph;
import java.util.*;

import Graph.UndirUnweight.Edge;
public class AllPathsSrctoDest {
	public static void srctodest(ArrayList<Edge>graph[],int curr,boolean vis[],int target,String path) {
		
		if(curr==target) {
			System.out.println(path);
			return ;
		}
		  vis[curr] = true;

		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(vis[e.dest]==false) {
				srctodest(graph, e.dest, vis, target, path+e.dest);
			}
		}
			
			vis[curr]=false;
		
	}
	public static void main(String[] args) {
		 int v = 7;
		    ArrayList<Edge>[] graph = new ArrayList[v];
		    UndirUnweight.createGraph(graph);
		    boolean[] vis = new boolean[v];
		    srctodest(graph, 0, vis, 5, "0");
	}

}
