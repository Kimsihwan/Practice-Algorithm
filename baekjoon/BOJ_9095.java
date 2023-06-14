/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/

import java.util.*;
import java.io.*;

public class BOJ_9095
{
    static int N;
    static int M;
    static int[] arr;
    static Integer[] dp = new Integer[10001];
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        dp = new Integer[M];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            dp[arr[i]] = 1;
        }

        // bottom up
        // for(int i = 1; i <= M; i++) {

        // }
        dfs(M);

        System.out.println(dp[M] == null ? -1 : dp[M]);
    }

    static int dfs(int i) {
        if(dp[i] == null) {
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < arr.length; j++) {
                min = Math.min(min, dfs(i-arr[j])+1);
            }
            dp[i] = min;
        }
        return dp[i];
    }
}
