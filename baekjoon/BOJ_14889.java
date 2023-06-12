import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14889 {
    static int N;
    static boolean[] visited;
    static int[][] graph;
    static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        visited = new boolean[N];
        graph = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0);

        System.out.println(answer);
    }

    static void dfs(int at, int depth) {
        if(depth == N/2) {
            diff();
            return;
        }

        for(int i = at; i < N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            dfs(i+1, depth+1);
            visited[i] = false;
        }
    }

    static void diff() {
        int team_start = 0;
        int team_link = 0;

        for(int i = 0; i < N-1; i++) {
            for(int j = i+1; j < N; j++) {
                if(visited[i] && visited[j]) {
                    team_start += graph[i][j];
                    team_start += graph[j][i];
                } else if(!visited[i] && !visited[j]) {
                    team_link += graph[i][j];
                    team_link += graph[j][i];
                }
            }
        }

        int min = Math.abs(team_start-team_link);

        if(min == 0) {
            System.out.println(min);
            System.exit(0);
        }

        answer = Math.min(answer, min);
    }
}