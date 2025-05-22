package P11;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        System.out.println("Latihan 5");
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.adjacencyMatrix();
        System.out.println();
        main2(args);
    }

    public static void main2(String[] args) {
        Graph graph1 = new Graph(4);
        System.out.println("Latihan 6");
        graph1.addVertex('A');
        graph1.addVertex('B');
        graph1.addVertex('C');
        graph1.addVertex('D');

        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(0, 3);
        graph1.addEdge(1, 3);
        graph1.adjacencyMatrix();
    }
}
