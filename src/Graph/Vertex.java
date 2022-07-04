package Graph;

public class Vertex {
    int id;
    ArrayList<> neighbors = new ArrayList<int>();

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
}
