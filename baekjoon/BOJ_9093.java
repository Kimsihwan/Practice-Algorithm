import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9093 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String rl = br.readLine();
            String[] arr = rl.split(" ");
            for(String value : arr) {
                StringBuilder sb = new StringBuilder();
                System.out.print(sb.append(value).reverse().toString()+" ");
            }
            System.out.println();
        }
    }
}
