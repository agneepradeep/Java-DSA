public class FibonacciSeries {
    public static void main (String[] args) {
        int n = 6;
        int[] m = new int[n+1];
        System.out.println(nthFibonacciTopBottomApproach(n,m));
        System.out.println(nthFibonacciBottomUPAppraoch(n));
        System.out.println(recursionApproach(n));
    }
    
    public static int recursionApproach(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return recursionApproach(n-1) + recursionApproach(n-2);
    }
    
    public static int nthFibonacciTopBottomApproach(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        } 
        if (dp[n] != 0) {
            return dp[n];
        }  
        int nm1 = nthFibonacciTopBottomApproach(n-1,dp);
        int nm2 = nthFibonacciTopBottomApproach(n-2,dp);
        dp[n] = nm1+nm2;
        return dp[n];
    }
    
    public static int nthFibonacciBottomUPAppraoch(int n) {
        int[] m = new int[n+1];
        m[0] = 0;
        m[1] = 1;
        for (int i = 2; i<n+1; i++) {
            m[i] = m[i-1] + m[i-2];
        }
        return m[n];
    }
}