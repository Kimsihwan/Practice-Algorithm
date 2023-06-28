import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_5585 {
    static int[] changes = new int[] {500,100 , 50, 10, 5, 1};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        N = 1000 - N;

        int answer = 0;
        for(int i = 0; i< changes.length; i++) {
            answer += (N/changes[i]);
            N%=changes[i];
        }

        System.out.println(answer);

    }
}