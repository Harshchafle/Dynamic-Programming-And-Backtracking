public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(climb(n));
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(memo(n, dp));
    }

    public static int climb(int n){
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        int one = climb(n-1);
        int two = climb(n-2);
        return one + two;
    }

    public static int memo(int n, int[] dp){
        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;
        if(dp[n] != -1) return dp[n];
        int one = climb(n-1, dp);
        int two = climb(n-2, dp);
        return dp[n] = one + two;
    }
}
