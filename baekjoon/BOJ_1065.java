import java.util.*;
import java.io.*;

public class BOJ_1065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = arithmetic_sequence(N);
        System.out.print(cnt);
    }

    private static int arithmetic_sequence(int N) {
        int cnt = 99;

        // 1 ~ 99 까지는 수열
        if(N < 100) {
            return N;
        } else {
            for(int i = 100; i <= N; i++) {
                int hun = i / 100;
                int ten = (i/10) % 10;
                int one = i % 10;

                // ex) 135 1-3 == 3-5 135는 등차수열인 한수
                if((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}