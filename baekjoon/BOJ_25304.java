import java.util.Scanner;
import java.io.*;
import java.util.*;
public class BOJ_25304 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        int M = Integer.parseInt(br.readLine());

        int sum = 0;
        StringTokenizer st = null;
        while(M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            sum += (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
        }

        if(sum == N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}