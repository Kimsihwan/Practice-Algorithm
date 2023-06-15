import java.util.Scanner;

public class BOJ_11055
{
    static int N;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N+1];
        dp = new int[N+1];

        for(int i = 1; i <= N; i++) {
            arr[i] = dp[i] = sc.nextInt();
        }

        dp[1] = arr[1];

        int max = dp[1];

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j < i; j++) {
                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[j]+arr[i], dp[i]);
                    max = Math.max(max, dp[i]);
                }
            }
        }

        System.out.println(max);
    }
}
