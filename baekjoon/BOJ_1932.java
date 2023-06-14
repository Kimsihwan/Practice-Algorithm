import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1932 {
    static int N;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        if(N == 1) {
            System.out.println(sc.nextInt());
            System.exit(0);
        }

        dp = new int[2];
        int v = sc.nextInt();
        dp[0] = v + sc.nextInt();
        dp[1] = v + sc.nextInt();

        for(int i = 3; i <= N; i++) {
            arr = new int[i];
            for(int j = 0; j < i; j++) {
                // 맨 처음 자리거나 끝자리 일 경우
                if(j == 0) {
                    arr[j] = dp[j]+sc.nextInt();
                } else if(i-1 == j) {
                    arr[j] = dp[j-1]+sc.nextInt();
                }else {
                    int m_v = sc.nextInt();
                    arr[j] = Math.max(dp[j-1]+m_v, dp[j]+m_v);
                }
            }
            dp = arr;
        }

        int answer = dp[0];
        for(int i = 1; i < N; i++) {
            answer = Math.max(answer, dp[i]);
        }
        System.out.println(answer);
    }
}