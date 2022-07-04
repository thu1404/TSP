package Graph;

public class Edge {
    int source, destination;
    float weight;

    // Constructor
    Edge(int sourceNode, int destinationNode, float edgeWeight){
        this.source = sourceNode;
        this.destination = destinationNode;
        this.weight = edgeWeight;
    }

    // Methods
    public void updateSource(int sourceUpdate){
        this.source = sourceUpdate;
    }

    public void updateDestination(int destinationUpdate){
        this.destination = destinationUpdate;
    }

    public void updateWeight(float weightUpdate){
        this.weight = weightUpdate;
    }
    public int getSource(){
        return source;
    }
    public int getDestination(){
        return destination;
    }

    public float getWeight(){
        return weight;
    }
}
