public class ClimbStairsProblem {
    public static void main (String[] args) {
        System.out.println(recursive(5));
        
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(climbStairsTopBottomApproach(5,dp));
        
        n = 5;
        dp = new int[n+1];
        System.out.println(climbStairsBottomUpApproach(5,dp));
    }
    
    public static int recursive (int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        int nm1 = recursive(n-1);
        int nm2 = recursive(n-2);
        int nm3 = recursive(n-3);
        return nm1+nm2+nm3;
    }

    public static int climbStairsTopBottomApproach (int n, int[] dp) {
        if (n == 1) {
            dp[n]=1;
            return 1;
        }
        if (n == 2) {
            dp[n]=2;
            return 2;
        }
        if (n == 3) {
            dp[n] = 4;
            return 4;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        int nm1 = climbStairsTopBottomApproach(n-1,dp);
        int nm2 = climbStairsTopBottomApproach(n-2,dp);
        int nm3 = climbStairsTopBottomApproach(n-3,dp);
        dp[n] = nm1+nm2+nm3;
        return dp[n];
    }

    public static int climbStairsBottomUpApproach (int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}