import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1149 {
    static int N;
    static long[][] dp;
    static int Red = 0;
    static int Green = 1;
    static int Blue = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        dp = new long[N][3];

        for(int i = 0; i < N; i++) {
            dp[i][Red] = sc.nextInt();
            dp[i][Green] = sc.nextInt();
            dp[i][Blue] = sc.nextInt();
        }

        for(int i = 1; i < N; i++) {
            dp[i][Red] += Math.min(dp[i-1][Green], dp[i-1][Blue]);
            dp[i][Green] += Math.min(dp[i-1][Red], dp[i-1][Blue]);
            dp[i][Blue] += Math.min(dp[i-1][Red], dp[i-1][Green]);
        }

        System.out.println(Math.min(dp[N-1][Red], Math.min(dp[N-1][Green], dp[N-1][Blue])));
    }
}