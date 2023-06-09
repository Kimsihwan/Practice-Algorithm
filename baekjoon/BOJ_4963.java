import java.io.*;

public class BOJ_4963 {
    static int[][] graph = new int[51][51];
    static boolean[][] visited = new boolean[51][51];
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1}; // 상, 하, 좌, 우, 좌상, 우상, 좌하, 우하
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};
    static int N;
    static int M;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String line = br.readLine();
        while(!line.equals("0 0"))  {
            String[] arr = line.split(" ");
            N = Integer.parseInt(arr[1]);
            M = Integer.parseInt(arr[0]);

            for(int i = 0; i < N; i++) {
                String[] arr2 = br.readLine().split(" ");
                for(int j = 0; j < M; j++) {
                    graph[i][j] = Integer.parseInt(arr2[j]);
                }
            }

            int cnt = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(graph[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            sb.append(cnt);
            sb.append("\n");

            graph = new int[51][51];
            visited = new boolean[51][51];
            line = br.readLine();
        }

        System.out.println(sb.toString());
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
            if(graph[nx][ny] != 1) continue;
            if(visited[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
}