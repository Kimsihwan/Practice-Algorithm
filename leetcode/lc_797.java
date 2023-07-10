package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_797 {
    static boolean[] visited;
    static int N;
    static List<List<Integer>> list;
    static List<Integer> answer;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        visited = new boolean[graph.length];
        N = graph.length-1;
        list = new ArrayList<>();
        answer = new ArrayList<>();
        visited[0] = true;
        answer.add(0);
        dfs(0,graph);
        return list;
    }

    private void dfs(int depth, int[][] graph) {
        if(depth == N) {
            list.add(new ArrayList<>(answer));
            return;
        }

        int[] arr = graph[depth];

        for(int v : arr) {
            if(visited[v]) continue;
            visited[v] = true;
            answer.add(v);
            dfs(v, graph);
            visited[v] = false;
            answer.remove(new Integer(v));
        }
    }
}
