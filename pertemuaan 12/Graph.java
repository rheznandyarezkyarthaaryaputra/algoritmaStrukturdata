import java.util.*;

public class Graph{

    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int vertex1, int vertex2) {
        List<Integer> neighbors = adjacencyList.getOrDefault(vertex1, new ArrayList<>());
        neighbors.add(vertex2);
        adjacencyList.put(vertex1, neighbors);
    }

    public void printGraph() {
        for (int vertex : adjacencyList.keySet()) {
            System.out.println("Vertex " + vertex + " terhubung dengan: " + adjacencyList.get(vertex));
        }
    }

    public int getDegree(int vertex) {
        return adjacencyList.get(vertex).size();
    }

    public int getIndegree(int vertex) {
        int indegree = 0;
        for (List<Integer> neighbors : adjacencyList.values()) {
            for (int neighbor : neighbors) {
                if (neighbor == vertex) {
                    indegree++;
                }
            }
        }
        return indegree;
    }

    public int getOutdegree(int vertex) {
        return getDegree(vertex) - getIndegree(vertex);
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Tambahkan edge ke graph
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(1, 20);
        graph.addEdge(2, 3);
        graph.addEdge(2, 1);
        graph.addEdge(3, 0);
        graph.addEdge(3, 4);
        graph.addEdge(3, 2);
        graph.addEdge(3, 1);
        graph.addEdge(4, 3);
        graph.addEdge(4, 1);
        graph.addEdge(4, 0);

        // Cetak graph
        graph.printGraph();

        // Hitung degree vertex 2
        int degree = graph.getDegree(2);
        System.out.println("Degree vertex 2: " + degree);

        // Hitung indegree dan outdegree vertex 2
        int indegree = graph.getIndegree(2);
        int outdegree = graph.getOutdegree(2);

        System.out.println("Indegree dari vertex 2: " + indegree);
        System.out.println("Outdegree dari vertex 2: " + outdegree);

        // Tambahkan edge lainnya ke graph
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(2, 1);

        // Cetak graph setelah penambahan edge
        graph.printGraph();
    }
}
