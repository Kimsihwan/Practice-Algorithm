import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 이름 : 로또
 * url : https://www.acmicpc.net/problem/6603
 * <p>
 * 1. 아이디어
 * - 백트래킹 재귀함수 안에서, for 돌면서 숫자 선택(이때 방문여부 확인)
 * - 재귀함수에서 M개를 선택헸을 경우 print
 * <p>
 * 2. 시간복잡도
 * - 최대 13C6 최대 1736
 * <p>
 * 3. 자료구조
 * - 결과값 저장 int[]
 * - 방문여부 체크 bool[]
 */
public class BOJ_6603 {

    static int n;
    static int[] arr;
    static boolean[] visit;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());

            if(n == 0) {
                break;
            }
            arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            result = new int[6];
            visit = new boolean[n];

            back(0, 0);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void back(int start, int depth) {
        // 6에 도달할 경우 print
        if(depth == 6) {
            for (int val : result ) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                result[depth] = arr[i];
                back(i, depth + 1);
                visit[i] = false;
            }
        }
    }
}
