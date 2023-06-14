import java.util.*;
public class BOJ_11727 {
    static int N;
    static int[] dp = new int[1001];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;

        for(int i = 3; i <= N; i++) {
            dp[i] = (dp[i-1]+(dp[i-2]*2)) % 10007;
        }

        System.out.println(dp[N]);
    }
}
