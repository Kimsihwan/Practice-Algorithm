import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이름 : 킹, 퀸, 룩, 비숍, 나이트, 폰
 * url : https://www.acmicpc.net/problem/3003
 * 
 * @author kimsihwan
 *
 */
public class BOJ_3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");

		int k = -Integer.parseInt(arr[0]) + 1;
		int q = -Integer.parseInt(arr[1]) + 1;
		int r = -Integer.parseInt(arr[2]) + 2;
		int b = -Integer.parseInt(arr[3]) + 2;
		int n = -Integer.parseInt(arr[4]) + 2;
		int p = -Integer.parseInt(arr[5]) + 8;

		System.out.println(k + " " + q + " " + r + " " + b + " " + n + " " + p);
	}
}

