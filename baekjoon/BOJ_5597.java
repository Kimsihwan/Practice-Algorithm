import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_5597 {
    static boolean[] arr = new boolean[31];
    public static void main(String[] args) throws Exception {

        arr[0] = true;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 28;
        while(cnt-- > 0) {
            arr[Integer.parseInt(br.readLine())] = true;
        }

        cnt = 2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i]) {
                sb.append(i);
                sb.append("\n");
                cnt--;
            }
            if(cnt == 0) break;
        }

        System.out.println(sb);

    }
}