import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1463 {
    static int N;
    static Integer[] arr;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new Integer[N+1];

        arr[0] = 0;
        arr[1] = 0;

        System.out.println(dp(N));
    }

    static int dp(int i) {

        if(arr[i] == null) {
            if(i % 6 == 0) {
                arr[i] = Math.min(dp(i/3), Math.min(dp(i/2), dp(i-1))) + 1;
            } else if(i % 3 == 0) {
                arr[i] = Math.min(dp(i/3), dp(i-1)) + 1;
            } else if(i % 2 == 0) {
                arr[i] = Math.min(dp(i/2), dp(i-1)) + 1;
            } else {
                arr[i] = dp(i-1)+ 1;
            }
        }
        return arr[i];
    }
}