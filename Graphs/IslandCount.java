public class IslandCount {
    public static void main (String[] args) {
        int[][] graphs = {{1,1,0,0,0},
                        {1,1,0,0,0},
                        {0,0,1,0,0},
                        {0,0,0,1,1}};
        int ans = 0;
        for (int i = 0; i<graphs.length; i++) {
            for (int j = 0; j<graphs[0].length; j++) {
                if (graphs[i][j] == 1) {
                    dfs(graphs,i,j);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    
    public static void dfs(int[][] arr, int i, int j) {
        arr[i][j] = 0;
        
        if (i+1<arr.length && arr[i+1][j] == 1){
           dfs(arr,i+1,j); 
        }
        if (i-1>=0 && arr[i-1][j] == 1){
           dfs(arr,i-1,j); 
        }
        if (j+1<arr[0].length && arr[i][j+1] == 1){
           dfs(arr,i,j+1); 
        }
        if (j-1>=0 && arr[i][j-1] == 1){
           dfs(arr,i,j-1); 
        }
    }
}