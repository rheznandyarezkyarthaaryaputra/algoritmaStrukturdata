public class mainCreativ{
    public static void main(String[] args) {
        CreativeGraph graph = new CreativeGraph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addEdge("A", "B");

        // Print the graph using the printGraph method
        graph.printGraph();

        // Check if a path exists from A to B and print the result
        System.out.println("Path from A to B: " + graph.hasPath("A", "B"));

        // Display a visual representation of the graph in the console
        graph.displayGraph();
    }
}
