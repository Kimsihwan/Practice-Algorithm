import java.util.*;
import java.io.*;

public class BOJ_11725 {
    static ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
    static boolean[] visited;
    static int[] parent;
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];
        parent = new int[N+1];

        int tmp = N-1;

        for(int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for(int i = 0; i < N-1; i++) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                dfs(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 2; i <= N; i++) {
            sb.append(parent[i]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    static void dfs(int depth) {
        visited[depth] = true;
        for(int node : tree.get(depth)) {
            if(!visited[node]) {
                parent[node] = depth;
                dfs(node);
            }
        }
    }
}