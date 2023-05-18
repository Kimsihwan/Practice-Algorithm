import java.util.*;
import java.io.*;

public class BOJ_1145 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int value = 1;
        int cnt = 0;
        while(true) {
            for(int k = 0; k < 5; k++) {
                if(value % arr[k] == 0) {
                    cnt++;
                }
            }

            if(cnt >= 3) {
                System.out.print(value);
                return;
            }
            cnt = 0;
            value++;
        }
    }
}