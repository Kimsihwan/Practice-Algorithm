import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10819 {

    private static int N;
    private static int[] arr = new int[8];
    private static int[] curArr = new int[8];
    private static boolean[] visit = new boolean[8];
    private static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);

        System.out.println(ans);
    }

    private static void dfs(int index) {
        // 기저 조건
        if(index == N) {
            int sum = 0;
            for(int i = 1; i< N; i++) {
                sum += Math.abs(curArr[i] - curArr[i - 1]);
            }
//            System.out.println("sum = " + Arrays.toString(curArr));
//            System.out.println("sum = " + sum);
            ans = Math.max(ans, sum);
            return;
        }

        for(int i = 0; i < N; i++) {
            if(!visit[i]) {
                curArr[index] = arr[i];
                visit[i] = true;
                dfs(index+1);
                visit[i] = false;
            }
        }
    }
}
