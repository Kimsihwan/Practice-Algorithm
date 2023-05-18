import java.util.*;
import java.io.*;


public class BOJ_1018 {
    static boolean[][] board;
    static int min = 64;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < M; j++) {
                if(line.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        int N_col = N - 7;
        int M_row = M - 7;

        for(int i = 0; i < N_col; i++) {
            for(int j = 0; j < M_row; j++) {
                find(i,j);
            }
        }

        System.out.print(min);
    }

    private static void find(int x, int y) {
        int x_end = x+8;
        int y_end = y+8;
        int cnt = 0;

        boolean TF = board[x][y];
        for(int i = x; i < x_end; i++) {
            for(int j = y; j < y_end; j++) {

                if(board[i][j] != TF) {
                    cnt++;
                }

                TF = !TF;
            }
            TF = !TF;
        }

        // 64를 빼주는 이유는 기준이 W면 B기준을 구하기 위해
        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(cnt, min);
    }

}