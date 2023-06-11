import java.util.*;
import java.io.*;

public class BOJ_15663 {
    static int N;
    static int M;
    static int[] arr;
    static int[] ans;
    static LinkedHashSet<String> set = new LinkedHashSet<>();
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        ans = new int[M];
        visited = new boolean[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        dfs(0);

        for(String str : set) {
            System.out.println(str);
        }
    }

    static void dfs(int k) {
        if(k == M) {
            StringBuilder sb = new StringBuilder();
            for(int v : ans) {
                sb.append(v).append(" ");
            }
            set.add(sb.toString());
            return;
        }

        for(int i = 0; i < N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            ans[k] = arr[i];
            dfs(k+1);
            visited[i] = false;
        }
    }
}