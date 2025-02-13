import java.util.*;
public class BFSTraversal {
    public static void main (String[] args) {
        int nodes = 7;
        int edges = 8;
        
        List<List<Integer>> graph = new LinkedList<>();
        List<Integer> destinationNodes = new LinkedList<>();
        
        destinationNodes.add(1);
        destinationNodes.add(3);
        graph.add(destinationNodes);
        destinationNodes = new LinkedList<>();
        
        destinationNodes.add(0);
        destinationNodes.add(2);
        graph.add(destinationNodes);
        destinationNodes = new LinkedList<>();
        
        destinationNodes.add(1);
        destinationNodes.add(3);
        destinationNodes.add(4);
        graph.add(destinationNodes);
        destinationNodes = new LinkedList<>();
        
        destinationNodes.add(0);
        destinationNodes.add(2);
        destinationNodes.add(4);
        graph.add(destinationNodes);
        destinationNodes = new LinkedList<>();
        
        destinationNodes.add(3);
        destinationNodes.add(5);
        destinationNodes.add(2);
        graph.add(destinationNodes);
        destinationNodes = new LinkedList<>();
        
        destinationNodes.add(6);
        destinationNodes.add(4);
        graph.add(destinationNodes);
        destinationNodes = new LinkedList<>();
        
        destinationNodes.add(5);
        graph.add(destinationNodes);
        destinationNodes = new LinkedList<>();
        
        for (int i = 0; i<graph.size(); i++) {
            System.out.println("Source("+i+")=Destination("+graph.get(i)+")");
        }
        BFS(graph,0);
    }
    
    public static void BFS(List<List<Integer>> graph, int src) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.size()];
        
        q.add(src);
        vis[src] = true;
        
        while (q.size() > 0) {
            int rem = q.remove();
            System.out.print(rem+"->");
            List<Integer> nbrs = graph.get(rem);
            for (int nbr: nbrs) {
                if (vis[nbr] == false) {
                    q.add(nbr);
                    vis[nbr] = true;
                }
            }
        }
        System.out.println("END");
    }
}