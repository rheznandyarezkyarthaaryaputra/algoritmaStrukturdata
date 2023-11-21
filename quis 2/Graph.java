import java.util.*;

class Graph {
    private Map<String, List<String>> adjVertices;

    Graph() {
        this.adjVertices = new HashMap<>();
    }

    void addVertex(String label) {
        adjVertices.putIfAbsent(label, new ArrayList<>());
    }

    void addEdge(String from, String to) {
        adjVertices.get(from).add(to);
    }

    List<String> getAdjVertices(String label) {
        return adjVertices.get(label);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String vertex : adjVertices.keySet()) {
            builder.append(vertex).append(" -> ").append(adjVertices.get(vertex)).append("\n");
        }
        return builder.toString();
    }
}
