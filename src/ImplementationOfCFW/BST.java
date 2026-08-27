package ImplementationOfCFW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BST {

    ArrayList<ArrayList<Integer>> graph;

    BST(int vertices) {

        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Add edge
    public void addEdge(int source, int destination) {

        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    // BFS
    public void bfs(int start) {

        boolean visited[] = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        visited[start] = true;

        while (!queue.isEmpty()) {

            int curr = queue.remove();

            System.out.print(curr + " ");

            for (int neighbour : graph.get(curr)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;

                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }

    // DFS
    public void dfs(int start) {

        boolean visited[] = new boolean[graph.size()];

        dfs(start, visited);

        System.out.println();
    }

    private void dfs(int curr, boolean visited[]) {

        visited[curr] = true;

        System.out.print(curr + " ");

        for (int neighbour : graph.get(curr)) {

            if (!visited[neighbour]) {

                dfs(neighbour, visited);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        BST graph = new BST(6);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        // BFS
        System.out.print("BFS: ");
        graph.bfs(0);

        // DFS
        System.out.print("DFS: ");
        graph.dfs(0);
    }
}