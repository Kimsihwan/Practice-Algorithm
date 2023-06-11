import java.util.Arrays;
import java.util.Scanner;

public class BOJ_15665 {
    static int N;
    static int M;
    static int[] ans;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        ans = new int[M];
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb);

    }

    static void dfs(int k) {
        if(k == M) {
            for(int v : ans) {
                sb.append(v).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = 0;
        for(int i = 0; i < N; i++) {
            if(before == arr[i]) continue;
            ans[k] = arr[i];
            before = arr[i];
            dfs(k+1);
        }
    }
}