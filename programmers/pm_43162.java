package programmers;


public class pm_43162 {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, n, computers);
                answer++;
            }
        }

        return answer;
    }

    void dfs(int depth, int n, int[][] computers) {
        visited[depth] = true;
        for(int i = 0; i < computers[depth].length; i++) {
            if(visited[i]) continue;
            if(computers[depth][i] != 1) continue;
            dfs(i, n, computers);
        }
    }
}
