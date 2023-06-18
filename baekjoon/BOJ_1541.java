import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1541 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] substraction =  br.readLine().split("[-]");

        int answer  = Integer.MAX_VALUE;

        for(int i = 0; i < substraction.length; i++) {
            String[] plustraction = substraction[i].split("[+]");

            int sum = 0;

            for(String v : plustraction)  {
                sum += Integer.valueOf(v);
            }

            if(answer == Integer.MAX_VALUE) {
                answer = sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);

    }
}