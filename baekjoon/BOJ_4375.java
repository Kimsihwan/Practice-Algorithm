import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            int base = 1;
            int cnt = 1;
            // 배수가 아닐 경우
            while((base=base%n) != 0) {
                cnt++;
                base = (base * 10) + 1;
            }
            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}
