package Graph;

import java.util.*;

public class CycleDetectionofDirectedGraph {

    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    // Create Graph
    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
//        graph[3].add(new Edge(3, 4)); // Creates a cycle
    }

    // DFS Cycle Detection
    public static boolean detectCycle(ArrayList<Edge>[] graph,
                                      boolean[] vis,
                                      boolean[] recStack,
                                      int curr) {

        vis[curr] = true;
        recStack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            if (recStack[e.dest]) {
                return true;
            }

            if (!vis[e.dest]) {
                if (detectCycle(graph, vis, recStack, e.dest)) {
                    return true;
                }
            }
        }

        recStack[curr] = false;
        return false;
    }

    public static void main(String[] args) {

        int V = 4;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] vis = new boolean[V];
        boolean[] recStack = new boolean[V];

        boolean hasCycle = false;

        // Check every component
        for (int i = 0; i < V; i++) {

            if (!vis[i]) {
                if (detectCycle(graph, vis, recStack, i)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println(hasCycle);
    }
}