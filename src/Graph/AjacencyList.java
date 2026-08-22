package Graph;
import java.util.*;
public class AjacencyList {
	static class Edge{
		int src;
		int dest;
		int weight;
		public Edge(int s,int d,int w) {
			this.src=s;
			this.dest=d;
			this.weight=w;
		}
	}
	public static void creategraph(ArrayList<Edge>graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList();
		}
		graph[0].add(new Edge(0, 2,10));
		
		graph[1].add(new Edge(1, 2,11));
		graph[1].add(new Edge(1, 3,12));
		
		graph[2].add(new Edge(2, 0,13));
		graph[2].add(new Edge(2, 3,14));
		graph[2].add(new Edge(2, 1,15));
		
		graph[3].add(new Edge(3,2,16));
		graph[3].add(new Edge(3,1,17));
	}
	public static void main(String[] args) {
		int v=4;
		ArrayList<Edge>graph[]=new ArrayList[v];
		 creategraph(graph);
		  for(int i = 0; i < graph.length; i++) {

		        for(int j = 0; j < graph[i].size(); j++) {

		            Edge e = graph[i].get(j);

		            System.out.print(e.src+"->"+e.dest + "-"+e.weight);
		        }

		        System.out.println();
	}
	}
}
