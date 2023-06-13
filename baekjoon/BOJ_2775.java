import java.util.*;

public class BOJ_2775 {
    static int[][] dp;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0) {
            // k층
            int K = sc.nextInt();
            // N호
            int N = sc.nextInt();
            dp = new int[15][15];

            // bottom up
            for(int i = 1; i <= N; i++) {
                dp[0][i] = i;
            }


            for(int i = 1; i <= K; i++) {
                dp[i][1] = 1;
                for(int j = 1; j <= N; j++) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
            System.out.println(dp[K][N]);
        }
    }
}