import java.util.*;
public class BOJ_2193 {
    static int N;
    static long[] dp = new long[91];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        dp[0] = 0l;
        dp[1] = 1l;


        for(int i = 2; i <= N; i++) {
            dp[i] = dp[i-2]+dp[i-1];
        }

        System.out.println(dp[N]);

    }
}
