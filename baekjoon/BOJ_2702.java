import java.util.*;
import java.io.*;

public class BOJ_2702 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = gcd(a,b);
            int lcm = (a*b)/gcd;
            sb.append(lcm).append(" ").append(gcd).append("\n");
        }

        System.out.println(sb);
    }


    private static int gcd(int a, int b) {
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
}