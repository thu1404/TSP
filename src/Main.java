import Graph.Graph;

public class Main {
    public static void  main(String[] args){

        Graph graphObject = new Graph();

        // adding Node
        graphObject.addNode('4');
        graphObject.addNode('2');

        // adding Edge
        graphObject.addEdge('4','2',2262);
        graphObject.addEdge('2','4',2262);

        graphObject.printGraph();
    }
}
