import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 이름 : N과 M (1)
 * url : https://www.acmicpc.net/problem/15649
 * <p>
 * 1. 아이디어
 * - 백트래킹 재귀함수 안에서, for 돌면서 숫자 선택(이때 방문여부 확인)
 * - 재귀함수에서 M개를 선택헸을 경우 print
 * <p>
 * 2. 시간복잡도
 * - N! > 가능
 * <p>
 * 3. 자료구조
 * - 결과값 저장 int[]
 * - 방문여부 체크 bool[]
 *
 * @author kimsihwan
 */
public class BOJ_15649 {

    private static Stack<Integer> rs;
    private static boolean[] chk;
    private static Integer N;
    private static Integer M;
    private static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = br.readLine().split(" ");
        N = Integer.valueOf(arr[0]);
        M = Integer.valueOf(arr[1]);

        rs = new Stack<Integer>();
        chk = new boolean[N + 1];

        recursive(0);
        br.close();
    }

    public static void recursive(Integer num) {
        if (num == M) {
            for (int i = 0; i < rs.size(); i++) {
                System.out.print(rs.get(i) + " ");
            }
			System.out.println();
            return;
        }

        for (int i = 1; i < N + 1; i++) {
            if (!chk[i]) {
                chk[i] = true;
				rs.add(i);
                recursive(num + 1);
				chk[i] = false;
				rs.pop();
            }
        }
    }

}
