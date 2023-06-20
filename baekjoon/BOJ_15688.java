import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_15688 {

    static int[] count = new int[2000001];
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            int idx = Integer.parseInt(br.readLine()) + 1000000;
            count[idx]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < count[i]; j++) {
                sb.append(i-1000000);
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}