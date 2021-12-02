import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이름 : 저작권
 * url : https://www.acmicpc.net/problem/2914
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2914 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");

		int a = Integer.parseInt(arr[0]);
		int l = Integer.parseInt(arr[1]);

		System.out.println(a * (l - 1) + 1);
	}
}

