/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/

import java.util.Scanner;

public class BOJ_11726
{
    static int N;
    static int[] dp = new int[1001];
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= N; i++) {
            dp[i] = (dp[i-2] + dp[i-1])%10007;
        }

        System.out.println(dp[N]);
    }
}
