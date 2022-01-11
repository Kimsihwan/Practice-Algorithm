package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 * 이름 : 괄호
 * url : https://www.acmicpc.net/problem/9012
 * 
 * @author kimsihwan
 *
 */
public class BOJ_9012 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			Stack<Character> st = new Stack<Character>();
			String nextLine = sc.next();
			
			boolean isValid = true;
			for(char ch : nextLine.toCharArray()) {	
				if(ch == '(') {
					st.push(ch);
				} else if(ch == ')') {
					if(st.isEmpty() || st.peek() != '(') {
						isValid = false;
						break;
					}
					st.pop();
				}
			}
			
			if(!st.isEmpty()) isValid = false;
			
			if(isValid){
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb);		
		sc.close();
	}
}
