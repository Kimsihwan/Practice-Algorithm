import java.util.*;
import java.io.*;

public class BOJ_1476 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int E = Integer.parseInt(arr[0]);
        int S = Integer.parseInt(arr[1]);
        int M = Integer.parseInt(arr[2]);
        int e = 0;
        int s = 0;
        int m = 0;
        int year = 0;

        while(true) {
            year++;
            e++;
            s++;
            m++;
            if(e == 16) e = 1;
            if(s == 29) s = 1;
            if(m == 20) m = 1;
            if(e == E && m == M && s == S) break;
        }

        System.out.print(year);
    }
}