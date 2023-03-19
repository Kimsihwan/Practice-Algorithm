import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1182 {

    private static int N;
    private static int S;
    private static int[] arr = new int[21];
    private static int ans = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        back(0,0);

        // S가 0이면 모든 원소를 전부 고르지 않는 경우도 포함된다.
        if(S == 0) ans--;

        System.out.println(ans);
    }

    /**
     *
     * @param index 현재 arr[index] 보고 있고
     * @param curSum 지금까지의 합은 curSum
     */
    private static void back(int index, int curSum) {

        // 기저 조건
        if(index == N) {
            // 지금 까지의 합이 S면, 한 가지 경우를 찾아냈다.
            if(curSum == S) ans++;
            return;
        }

        back(index + 1, curSum); // arr[index]를 선택하지 않은 경우
        back(index + 1, curSum + arr[index]); // arr[index]를 선택하는 경우
    }
}
