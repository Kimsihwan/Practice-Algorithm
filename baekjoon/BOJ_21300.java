import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 이름 : Bottle Return 
 * url : https://www.acmicpc.net/problem/21300
 * 
 * @author kimsihwan
 *
 */
public class BOJ_21300 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		System.out.println((a + b + c + d + e + f) * 5);
		sc.close();
	}
}
