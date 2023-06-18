import java.util.*;
import java.io.*;

public class BOJ_11501 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            long[] arr = new long[N];
            String[] arr2 = br.readLine().split(" ");
            for(int i = 0; i < N; i++) {
                arr[i] = Long.parseLong(arr2[i]);
            }

            long max = 0;
            long answer = 0;
            for(int i = N-1; i >= 0; i--) {
                if(arr[i] > max) {
                    max = arr[i];
                } else {
                    answer += (max-arr[i]);
                }
            }
            System.out.println(answer);
        }

    }
}