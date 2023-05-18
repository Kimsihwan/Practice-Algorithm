import java.util.*;
import java.io.*;

public class BOJ_14697 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= 50; i++) {
            for(int j = 0; j <= 50; j++) {
                for(int k = 0; k <= 50; k++) {
                    int sum = (i*A) + (j*B) + (k*C);
                    if(sum > N) {
                        break;
                    }
                    if(sum == N) {
                        System.out.print("1");
                        return;
                    }
                }
            }
        }

        System.out.print("0");
    }
}