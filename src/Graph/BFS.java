package Graph;

import java.util.*;

public class BFS {

    // Edge class
    static class Edge {

        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    // ------------------------------------------------
    // 1. BFS for CONNECTED GRAPH
    // ------------------------------------------------
    public static void bfsConnected(ArrayList<Edge> graph[], int V) {

        boolean vis[] = new boolean[V];

        Queue<Integer> q = new LinkedList<>();

        // Start from vertex 0
        q.add(0);

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (!vis[curr]) {

                System.out.print(curr + " ");

                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {

                    Edge e = graph[curr].get(i);

                    if (!vis[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    // ------------------------------------------------
    // 2. BFS for DISCONNECTED GRAPH
    // ------------------------------------------------
    public static void bfsDisconnected(ArrayList<Edge> graph[], int V) {

        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!vis[i]) {

                bfsFromVertex(graph, V, vis, i);
            }
        }
    }

    // BFS from a particular vertex
    public static void bfsFromVertex(
            ArrayList<Edge> graph[],
            int V,
            boolean vis[],
            int start) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()) {

            int curr = q.remove();

            if (!vis[curr]) {

                System.out.print(curr + " ");

                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {

                    Edge e = graph[curr].get(i);

                    if (!vis[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    // ------------------------------------------------
    // 3. CREATE UNDIRECTED GRAPH
    // ------------------------------------------------
    public static void createUndirectedGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 <-> 1
        graph[0].add(new Edge(0, 1, 10));
        graph[1].add(new Edge(1, 0, 10));

        // 1 <-> 2
        graph[1].add(new Edge(1, 2, 20));
        graph[2].add(new Edge(2, 1, 20));

        // 2 <-> 3
        graph[2].add(new Edge(2, 3, 30));
        graph[3].add(new Edge(3, 2, 30));

        // 3 <-> 4
        graph[3].add(new Edge(3, 4, 40));
        graph[4].add(new Edge(4, 3, 40));

        // 5 is disconnected
    }

    // ------------------------------------------------
    // MAIN
    // ------------------------------------------------
    public static void main(String[] args) {

        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createUndirectedGraph(graph);

        // Connected BFS
        System.out.println("Connected Graph BFS:");

        bfsConnected(graph, V);


        // Disconnected BFS
        System.out.println("\n\nDisconnected Graph BFS:");

        bfsDisconnected(graph, V);
    }
}