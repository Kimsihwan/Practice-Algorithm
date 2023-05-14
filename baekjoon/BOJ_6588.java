import java.io.*;
import java.util.*;

public class BOJ_6588 {
    static int MAX = 1000000;
    static boolean[] primeArr = new boolean[MAX+1];
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws Exception{
        makePrime();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;
        // 입력이 0이 아닐때 까지
        while(!(s = br.readLine()).equals("0")) {
            int N = Integer.parseInt(s);
            String answer = "Goldbach's conjecture is wrong.";
            for(int i = 2;  i <= N/2; i++) {
                if(!primeArr[i] && !primeArr[N-i]) {
                    answer = N + " = " + i + " + " + (N - i);
                    break;
                }
            }
            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }

    private static void makePrime() {
        // prime이 false면 소수

        // 1은 소수가 아님
        primeArr[0] = primeArr[1] = true;

        for(int i = 2; i <= Math.sqrt(MAX); i++) {
            // 소수일 경우
            if(!primeArr[i]) {
                for(int j = i*i; j < MAX+1; j+=i) {
                    primeArr[j] = true;
                }
            }
        }
    }
}