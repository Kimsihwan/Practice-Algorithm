import java.util.*;

public class BOJ_11053 {
    static int N;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        dp = new int[N];

        Arrays.fill(dp, 1);

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j]+1;
                }
            }
        }

        int max = dp[0];
        for(int i = 1; i < N; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);

    }
}