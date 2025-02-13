import java.util.*;

class Pair {
    int destination;
    int weight;

    Pair(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Type no. of Nodes: ");
        int nodes = read.nextInt();
        
        System.out.print("Type no. of Edges: ");
        int edges = read.nextInt();
        
        ArrayList<Pair>[] adjacencyList = new ArrayList[nodes]; 
        
        int source, destination, weight;
        for (int i = 0; i < nodes; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        
        for (int i = 0; i<edges; i++) {
            System.out.print("Type (Source, Destination, Weight): ");
            source = read.nextInt();
            destination = read.nextInt();
            weight = read.nextInt();
            Pair pr = new Pair(destination, weight);
            adjacencyList[source].add(pr);
        }
        
        System.out.println("Adjacency List:");
        for (int i = 0; i < nodes; i++) {
            System.out.print("Node " + i + ": ");
            for (Pair pair : adjacencyList[i]) {
                System.out.print(pair.destination + "(" + pair.weight + ") ");
            }
            System.out.println();
        }
        
        read.close();
    }
}
