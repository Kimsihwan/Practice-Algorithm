import java.util.*;
import java.io.*;

public class BOJ_2851 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 10;
        int sum = 0;
        while(N-- > 0) {
            int value = Integer.parseInt(br.readLine());
            if(sum<100) {
                if(sum+value > 100) {
                    int a = Math.abs(sum - 100);
                    int b = Math.abs(sum+value - 100);
                    if(a<b) {
                        break;
                    }
                }
                sum+=value;
            }

        }
        System.out.print(sum);
    }
}