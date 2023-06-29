import java.io.*;
import java.util.*;

public class BOJ_10974 {
    static boolean[] visited;
    static int[] arr;
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visited = new boolean[N];
        arr = new int[N];


        backtracking(0);
        System.out.println(sb);
    }

    static void backtracking(int depth) {
        if(depth == N) {
            for(int i = 0; i < N; i++) {
                sb.append((arr[i]+1)+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            arr[depth] = i;
            backtracking(depth+1);
            visited[i] = false;
        }
    }
}