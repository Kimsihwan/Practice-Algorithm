package programmers;

public class pm_12900 {
    static int[] dp;
    public int solution(int n) {
        int answer = 0;
        dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1])%1000000007;
        }

        return dp[n];
    }
}
