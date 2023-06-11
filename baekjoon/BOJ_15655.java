import java.util.Arrays;
import java.util.Scanner;

public class BOJ_15655 {
    static int N;
    static int M;
    static int[] arr;
    static int[] ans;
    static boolean[] visited = new boolean[10001];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        ans = new int[M];

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

        for(int i = 0; i < N; i++) {
            if(visited[arr[i]]) continue;
            if(k != 0 && ans[k-1] >= arr[i]) continue;
            visited[arr[i]] = true;
            ans[k] = arr[i];
            dfs(k+1);
            visited[arr[i]] = false;
        }
    }
}