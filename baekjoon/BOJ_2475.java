import java.util.Scanner;

/**
 * 이름 : 긴자리 계산 
 * url : https://www.acmicpc.net/problem/2475
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2475 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		System.out.println(((a * a) + (b * b) + (c * c) + (d * d) + (e * e)) % 10);
		sc.close();
	}
	
}
