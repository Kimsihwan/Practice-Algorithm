import java.util.Scanner;

public class BOJ_11659 {
    static int N;
    static int M;
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        dp = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];

        for(int i = 1; i < N; i++) {
            dp[i] = dp[i-1]+arr[i];
        }

        while(M-- > 0) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            if(i == 0) {
                System.out.println(dp[j]);
            } else {
                System.out.println(dp[j]-dp[i-1]);
            }
        }

    }
}