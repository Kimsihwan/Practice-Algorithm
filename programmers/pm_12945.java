package programmers;

import java.util.Stack;


public class pm_12945 {
    static int[] memo = new int[100001];
    public int solution(int n) {
        return fibo(n);
    }

    public int fibo(int n) {
        if(n <= 1) return n;
        else if(memo[n] != 0) return memo[n];
        else
            return memo[n] = (fibo(n-2) + fibo(n-1)) % 1234567;
    }
}
