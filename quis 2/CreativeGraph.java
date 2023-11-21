import java.util.*;

public class CreativeGraph {
    private Map<String, LinkedList<String>> adjVertices;

    public CreativeGraph() {
        this.adjVertices = new HashMap<>();
    }

    public void addVertex(String label) {
        adjVertices.putIfAbsent(label, new LinkedList<>());
    }

    public void addEdge(String from, String to) {
        adjVertices.get(from).add(to);
    }

    public boolean hasPath(String from, String to) {
        Set<String> visited = new HashSet<>();
        return hasPathRecursive(from, to, visited);
    }

    private boolean hasPathRecursive(String from, String to, Set<String> visited) {
        if (!adjVertices.containsKey(from) || visited.contains(from)) {
            return false;
        }
        visited.add(from);
        if (from.equals(to)) {
            return true;
        }
        for (String neighbor : adjVertices.get(from)) {
            if (hasPathRecursive(neighbor, to, visited)) {
                return true;
            }
        }
        return false;
    }

    public void printGraph() {
        for (String vertex : adjVertices.keySet()) {
            System.out.println(vertex + " -> " + adjVertices.get(vertex));
        }
    }

    // A simple method to display a visual representation of the graph in console
    public void displayGraph() {
        for (Map.Entry<String, LinkedList<String>> entry : adjVertices.entrySet()) {
            String from = entry.getKey();
            LinkedList<String> edges = entry.getValue();
            if (edges.isEmpty()) {
                System.out.println(from + " (No outgoing edges)");
            } else {
                for (String to : edges) {
                    System.out.println(from + " -> " + to);
                }
            }
        }
    }
}