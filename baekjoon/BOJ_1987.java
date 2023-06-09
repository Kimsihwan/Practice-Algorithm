import java.io.*;

public class BOJ_1987 {
    static int N;
    static int M;
    static int[][] graph;
    static boolean[] visited = new boolean[26];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int ans = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        M = Integer.parseInt(arr[1]);
        graph = new int[N][M];

        for(int i = 0; i < N; i++) {
            String str  = br.readLine();
            for(int j = 0; j < M; j++) {
                graph[i][j] = str.charAt(j) - 'A';
            }
        }

        dfs(0,0,1);

        System.out.println(ans);
    }

    static void dfs(int x, int y, int cnt) {
        visited[graph[x][y]] = true;
        ans = Math.max(ans, cnt);
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
            if(visited[graph[nx][ny]]) continue;
            dfs(nx, ny, cnt+1);
            visited[graph[nx][ny]] = false;
        }
    }
}