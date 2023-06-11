import java.io.*;
import java.util.*;

public class BOJ_15654 {
    static int N;
    static int M;
    static int[] arr;
    static int[] ans;
    static boolean[] visited;
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

        int max = arr[N-1];
        visited = new boolean[max+1];

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

        for(int v : arr) {
            if(visited[v]) continue;
            visited[v] = true;
            ans[k] = v;
            dfs(k+1);
            visited[v] = false;
        }
    }
}