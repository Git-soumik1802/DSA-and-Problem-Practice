package Graph;

import java.util.*;

public class UndirUnweight {

    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // BFS Traversal
    public static void bfs(ArrayList<Edge>[] graph, int start, boolean vis[]) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);

                if (!vis[e.dest]) {
                    vis[e.dest] = true;
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS Traversal
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {

        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // Create Graph
    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected Graph

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void main(String[] args) {

        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        // ---------------- BFS ----------------
        System.out.println("BFS Traversal:");
        boolean vis1[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis1[i]) {
                bfs(graph, i, vis1);
            }
        }

        System.out.println();

        // ---------------- DFS ----------------
        System.out.println("DFS Traversal:");
        boolean vis2[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis2[i]) {
                dfs(graph, i, vis2);
            }
        }

        System.out.println();
    }
}