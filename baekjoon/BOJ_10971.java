import java.util.*;
import java.io.*;

public class BOJ_10971 {
    static int N;
    static int[][] graph;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        visited = new boolean[N];
        graph = new int[N][N];


        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0] = true;
        dfs(0,0,0,0);

        System.out.println(min);
    }

    static void dfs(int start, int now, int cnt, int cost) {
        for(int i = 0; i < N; i++) {
            if(graph[now][i] > 0) {
                if(i == start && cnt == N-1) {
                    cost += graph[now][i];
                    min = Math.min(min, cost);
                    return;
                }
                else if(!visited[i]) {
                    visited[i] = true;
                    cost += graph[now][i];

                    dfs(start, i, cnt+1, cost);

                    cost -= graph[now][i];
                    visited[i] = false;
                }
            }
        }
    }
}