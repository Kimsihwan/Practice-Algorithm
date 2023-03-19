import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2580 {

    private static int[][] sudoku = new int[9][9];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0,0);
    }

    // x행 y열을 보고 있다.
    private static void solve(int x, int y) {

        // 기저 사례
        if( x > 8) {
            // 모든 칸이 다 채워졌다는 것은, 현재 스도쿠에 모순이 없다는 뜻이다.

            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        // 이미 숫자가 채워져 있으면, 다음 칸을 본다.
        if(sudoku[x][y] != 0) {
            // y축 끝일 경우 다음 줄로 넘어감
            if(y == 8) {
                solve(x + 1, 0);
            } else {
                solve(x, y + 1);
            }
            return;
        }

        for(int n = 1; n <= 9; n++) {
            boolean isValid = true;

            // 현재 행에 n이 존재하지는지 확인
            for(int yj = 0; yj < 9; yj++) {
                int curVal = sudoku[x][yj];
                if(curVal == n) {
                    isValid = false;
                }
            }

            // 현재 열에 n이 존재하는지 확인
            for(int ix = 0; ix < 9; ix++) {
                int curVal = sudoku[ix][y];
                if(curVal == n) {
                    isValid = false;
                }
            }

            for(int i = 0; i < 3; i++) {
                // 현재 3X3 박스에 n이 존재하는지 확인
                for(int j = 0; j < 3; j++) {
                    int ix = x / 3 * 3 + i;
                    int iy = y / 3 * 3 + j;
                    if(sudoku[ix][iy] == n) {
                        isValid = false;
                    }
                }
            }


            // 현재 칸에 n을 넣었을 때 모순이 있다면, 더 이상 진행하지 않는다.(가지치기)
            if(!isValid) {
                continue;
            }

            // 현재 칸에 n을 넣어본다음 다음으로 넘어간다.
            sudoku[x][y] = n;

            if(y==8) {
                solve(x+1, 0);
            } else {
                solve(x, y + 1);
            }

            // 만약 올바른 스도쿠를 찾지 못했다면, 이전 상황으로 돌아간다.
            sudoku[x][y] = 0;
        }
    }
}
