import java.util.Scanner;

public class BOJ_9461 {
    static int T;
    static int N;
    static long[] dp;
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        while(T-- > 0) {

            N = sc.nextInt();

            dp = new long[101];

            dp[0] = 0l;
            dp[1] = 1l;
            dp[2] = 1l;

            for(int i = 3; i <= N; i++) {
                dp[i] = dp[i-3] + dp[i-2];
            }

            System.out.println(dp[N]);

        }
    }
}
