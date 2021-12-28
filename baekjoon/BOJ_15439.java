import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 이름 : Vera and Outfits 
 * url : https://www.acmicpc.net/problem/15439
 * 
 * @author kimsihwan
 *
 */
public class BOJ_15439 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int rs = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					rs++;
				}
			}
		}
		System.out.println(rs);
		sc.close();
	}
}
