import java.util.Scanner;

public class BOJ_2748 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] dp = new long[91];

        dp[1] = 1l;
        dp[2] = 1l;

        for(int i = 3; i <= N; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[N]);
    }
}