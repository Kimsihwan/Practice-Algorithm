import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_1929 {
    static boolean[] prime = new boolean[1000001];
    public static void main(String[] agrs) throws Exception {
        int max = 1000000;

        // prime false는 소수
        // 1은 소수가 아님
        prime[0] = prime[1] = true;

        // 제곱 N까만 구해도 됨
        for(int i = 2; i < Math.sqrt(max); i++) {
            // 소수일 경우
            if(!prime[i]) {
                // i 제곱부터 시작하고 j의 배수만큼 증가
                for(int j = i*i; j <= max; j+=i) {
                    prime[j] = true;
                }
            }
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int N = Integer.parseInt(strArr[0]);
        int M = Integer.parseInt(strArr[1]);

        StringBuilder sb = new StringBuilder();
        for(int i = N; i <= M; i++) {
            // 소수일 경우
            if(!prime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}