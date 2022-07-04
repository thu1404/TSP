package Graph;

import java.util.ArrayList;

public class Vertex {
    int id;
    ArrayList<Integer> neighbors = new ArrayList<Integer>();

    // Constructor
    Vertex(int Name){
        this.id = Name;
    }

    public void updateId(int updatedName){
        this.id = updatedName;
    }

    public void addNeighbor(int neighbor){
        neighbors.add(neighbor);
    }

    public int getId(){
        return id;
    }
}
