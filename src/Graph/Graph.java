package Graph;

public class Graph{

    Map<int,Vertex> nodeMap = new HashMap<int,Vertex>();
    List<Edge> edgeList = new ArrayList<Edge>();

    public addNode(int id){
        nodeMap.put(id,new Vertex(identifier));
    }

    public addEdge(int source,int destination,float weight){
        edgeList.add(new Edge(source,destination,weight));
        nodeMap.get(source).addNeighbor(destination);
        nodeMap.get(destination).addNeighbor(source);
    }


}