import java.util.*;
import java.io.*;

public class BOJ_14501 {
    static int N;
    static int[] T;
    static int[] P;
    static int[] dp;
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        T = new int[N];
        P = new int[N];
        dp = new int[N+1];

        for(int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int next = i + T[i];
            if(next <= N) {
                dp[next] = Math.max(dp[next], dp[i]+P[i]);
            }

            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }

        System.out.println(Arrays.toString(dp));
    }
}
