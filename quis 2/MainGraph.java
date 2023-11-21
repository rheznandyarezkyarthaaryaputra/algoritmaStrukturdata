public class MainGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");

        System.out.println(graph);
    }
}
