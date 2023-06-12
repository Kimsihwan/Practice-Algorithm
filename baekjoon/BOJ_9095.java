import java.util.Arrays;
import java.util.Scanner;

public class BOJ_9095 {
    static Integer[] memo = new Integer[12];
    public static void main(String[] args) throws Exception {

        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            dp(N);
            System.out.println(memo[N]);
        }
    }

    static int dp(int k) {
        if(memo[k] == null) {
            memo[k] = dp(k-1)+dp(k-2)+dp(k-3);
        }
        return memo[k];
    }
}