class MinimumPathSumProblem {
    /** Constraint - Move down or right only.*/
    public static void main (String[]  args) {
        int[][] arr = {{1,3,1},
                        {1,5,1},
                        {4,2,1}};
        System.out.println(minPathSum(arr,0,0));
        int[][] dp = new int[arr.length][arr[0].length];
        System.out.println(topDownApproach(arr,0,0,dp));
    }
    
    public static int minPathSum(int[][] arr, int i, int j) {
        if (i >= arr.length || j >= arr[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == (arr.length-1) && j==(arr[0].length -1)) {
            return arr[i][j];
        }
        int rightPath = minPathSum(arr, i, j+1);
        int bottomPath = minPathSum(arr, i+1, j);
        return arr[i][j]+Math.min(rightPath, bottomPath);
    }

    public static int topDownApproach(int[][] arr, int i, int j, int[][] dp) {
        if (i >= arr.length || j >= arr[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == (arr.length-1) && j==(arr[0].length -1)) {
            return arr[i][j];
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        int rightPath = minPathSum(arr, i, j+1);
        int bottomPath = minPathSum(arr, i+1, j);
        dp[i][j] = arr[i][j]+Math.min(rightPath, bottomPath);
        return dp[i][j];
    }
}