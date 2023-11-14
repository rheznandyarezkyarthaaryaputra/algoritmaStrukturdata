import java.util.*;

class Graph<T> {
    private Map<T, List<T>> adjacencyList;
    private boolean isDirected;

    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        adjacencyList = new HashMap<>();
    }

    public void addEdge(T vertex1, T vertex2) {
        List<T> neighbors1 = adjacencyList.getOrDefault(vertex1, new ArrayList<>());
        neighbors1.add(vertex2);
        adjacencyList.put(vertex1, neighbors1);

        if (!isDirected) {
            List<T> neighbors2 = adjacencyList.getOrDefault(vertex2, new ArrayList<>());
            neighbors2.add(vertex1);
            adjacencyList.put(vertex2, neighbors2);
        }
    }

    public void printGraph() {
        for (T vertex : adjacencyList.keySet()) {
            System.out.println("Vertex " + vertex + " terhubung dengan: " + adjacencyList.get(vertex));
        }
    }

    public int getDegree(T vertex) {
        return adjacencyList.getOrDefault(vertex, Collections.emptyList()).size();
    }

    public int getIndegree(T vertex) {
        int indegree = 0;
        for (List<T> neighbors : adjacencyList.values()) {
            indegree += Collections.frequency(neighbors, vertex);
        }
        return indegree;
    }

    public int getOutdegree(T vertex) {
        return getDegree(vertex) - getIndegree(vertex);
    }

    public boolean graphType() {
        return isDirected;
    }

    public void removeEdge(T source, T destination) {
        List<T> neighbors = adjacencyList.get(source);
        if (neighbors != null) {
            neighbors.remove(destination);
        }
    }

    public void removeAllEdges() {
        for (List<T> neighbors : adjacencyList.values()) {
            neighbors.clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public static void main(String[] args) {
        Graph<String> graph = new Graph<>(false); // false untuk undirected, true untuk directed

        // Tambahkan edge ke graph
        graph.addEdge("Malang", "Surabaya");
        graph.addEdge("Malang", "Gresik");
        graph.addEdge("Malang", "Bandung");
        graph.addEdge("Surabaya", "Gresik");
        graph.addEdge("Surabaya", "Malang");
        graph.addEdge("Surabaya", "Jakarta");
        graph.addEdge("Yogyakarta", "Gresik");
        graph.addEdge("Yogyakarta", "Surabaya");
        graph.addEdge("Bandung", "Malang");
        graph.addEdge("Bandung", "Jakarta");
        graph.addEdge("Jakarta", "Surabaya");
        graph.addEdge("Jakarta", "Malang");
        graph.addEdge("Jakarta", "Bandung");

        // Cetak graph
        graph.printGraph();

        // Hitung degree vertex "Surabaya"
        int degree = graph.getDegree("Surabaya");
        System.out.println("Degree vertex Surabaya: " + degree);

        // Hitung indegree dan outdegree vertex "Surabaya"
        int indegree = graph.getIndegree("Surabaya");
        int outdegree = graph.getOutdegree("Surabaya");

        System.out.println("Indegree dari vertex Surabaya: " + indegree);
        System.out.println("Outdegree dari vertex Surabaya: " + outdegree);

        // Tambahkan edge lainnya ke graph
        graph.addEdge("Malang", "Surabaya");
        graph.addEdge("Malang", "Gresik");
        graph.addEdge("Malang", "Bandung");

        // Cetak graph setelah penambahan edge
        graph.printGraph();

        // Remove edge
        graph.removeEdge("Surabaya", "Gresik");

        // Cetak graph setelah penghapusan edge
        graph.printGraph();

        // Remove all edges
        graph.removeAllEdges();

        // Cetak graph setelah mengosongkan graph
        graph.printGraph();
    }
}
