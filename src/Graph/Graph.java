package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph{

    Map<Integer,Vertex> nodeMap = new HashMap<Integer,Vertex>();
    List<Edge> edgeList = new ArrayList<Edge>();

    public void addNode(int id){
        nodeMap.put(id,new Vertex(id));
    }

    public void addEdge(int source, int destination, float weight){
        edgeList.add(new Edge(source,destination,weight));
        nodeMap.get(source).addNeighbor(destination);
        nodeMap.get(destination).addNeighbor(source);
    }

    public void printGraph(){
        for(int i=0; i<edgeList.size(); i++){
            System.out.println(edgeList.get(i).getSource()-48);
        }

    }

}