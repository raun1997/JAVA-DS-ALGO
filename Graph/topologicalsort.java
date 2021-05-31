import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalsort {
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
        addEdge(adj, 5, 2);
        addEdge(adj, 5, 0);
        addEdge(adj, 4, 0);
        addEdge(adj, 4, 1);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 1);
        topologicalSort(adj, V);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V) {
        int[] in_degree = new int[V];
        for (int u = 0; u < V; u++) {
            for (int x : adj.get(u))
                in_degree[x]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (in_degree[i] == 0)
                queue.add(i);

        }
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.print(u + " ");
            for (int x : adj.get(u))
                if (--in_degree[x] == 0)
                    queue.add(x);
        }
    }
}
