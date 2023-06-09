import java.util.*;
import java.io.*;

public class BOJ_11724 {
    static int N;
    static int M;
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt()+1;
        M = sc.nextInt();

        while(M-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }

        int cnt = 0;


        for(int i = 1; i < N; i++) {
            if(!visited[i]) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static void dfs(int depth) {

        visited[depth] = true;
        for(int i = 0; i < N; i++) {
            if(graph[depth][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }

    }
}