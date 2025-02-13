import java.util.*;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.print("Type no. of Nodes: ");
        int nodes = read.nextInt();
        
        System.out.print("Type no. of Edges: ");
        int edges = read.nextInt();
        
        int[][] adjacencyMatrix = new int[nodes][nodes];
        
        int source, destination, weight;
        for (int i = 0; i<edges; i++) {
            System.out.print("Type (Source Destination Weight): ");
            source = read.nextInt();
            destination = read.nextInt();
            weight = read.nextInt();
            
            adjacencyMatrix[source][destination] = weight;
        }
        for (int i = 0; i<nodes; i++) {
            System.out.println(Arrays.toString(adjacencyMatrix[i]));
        }
        read.close();
    }
}