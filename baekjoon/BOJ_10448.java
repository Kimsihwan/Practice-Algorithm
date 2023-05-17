import java.util.*;
import java.io.*;

public class BOJ_10448 {

    static int[] arr = new int[46];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= 45; i++) {
            arr[i] = i*(i+1)/2;
        }

        System.out.print(Arrays.toString(arr));

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            int answer = 0;

            for(int i = 1; i <= 45; i++) {
                for(int j = 1; j <= 45; j++) {
                    for(int k = 1; k <= 45; k++) {
                        if(k == (arr[i]+arr[j]+arr[k])) {
                            answer = 1;
                            break;
                        }
                    }
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);

    }
}