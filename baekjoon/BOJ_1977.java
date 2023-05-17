import java.util.*;
import java.io.*;

public class BOJ_1977 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int min = -1;
        int sum = 0;

        for(int i = 1; i*i<= M; i++) {
            if(N <= i*i) {
                if(min == -1) {
                    min = i*i;
                }
                sum += i*i;
            }
        }
        if(min == -1) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}