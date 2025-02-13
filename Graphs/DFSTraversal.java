import java.util.*;

public class DFSTraversal {
    
    public static void main (String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        ArrayList<Integer> destinationNodes = new ArrayList<>();
        destinationNodes.add(1);
        destinationNodes.add(3);
        graph.add(destinationNodes);
        
        destinationNodes = new ArrayList<>();
        destinationNodes.add(0);
        destinationNodes.add(2);
        graph.add(destinationNodes);
        
        destinationNodes = new ArrayList<>();
        destinationNodes.add(1);
        destinationNodes.add(3);
        graph.add(destinationNodes);
        
        destinationNodes = new ArrayList<>();
        destinationNodes.add(0);
        destinationNodes.add(4);
        graph.add(destinationNodes);
        
        destinationNodes = new ArrayList<>();
        destinationNodes.add(3);
        destinationNodes.add(5);
        graph.add(destinationNodes);
        
        destinationNodes = new ArrayList<>();
        destinationNodes.add(4);
        destinationNodes.add(6);
        graph.add(destinationNodes);
        
        destinationNodes = new ArrayList<>();
        destinationNodes.add(4);
        destinationNodes.add(5);
        graph.add(destinationNodes);
        boolean[] vis = new boolean[graph.size()];
        dfs(graph,0,vis);
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int src, boolean[] vis) {
        vis[src] = true;
        System.out.print(src+" ");
        
        ArrayList<Integer> nbrs = graph.get(src);
        
        for (int nbr: nbrs) {
            if (vis[nbr] == false) {
                dfs(graph, nbr, vis);   
            }
        }
    }
}