import java.util.Scanner;

public class BOJ_12852 {
    static int N;
    static Integer[] dp = new Integer[1000001];
    static int[] before = new int[1000001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dp[1] = before[1] = 0;

        find(N);

        sb.append(dp[N]);
        sb.append("\n");

        int A = N;
        while(A > 0) {
            sb.append(A+" ");
            A = before[A];
        }
        System.out.println(sb);
    }

    static int find(int i) {
        if(dp[i] == null){
            int min = find(i-1)+1;
            before[i] = i-1;
            if(i % 2 == 0 && min > find(i/2)+1) {
                min = find(i/2)+1;
                before[i] = i/2;
            }

            if(i%3 == 0 && min > find(i/3)+1) {
                min = find(i/3)+1;
                before[i] = i/3;
            }
            dp[i] = min;
        }
        return dp[i];
    }
}