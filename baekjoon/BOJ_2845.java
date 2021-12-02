import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 이름 : 파티가 끝나고 난 뒤
 * url : https://www.acmicpc.net/problem/2845
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr1 = br.readLine().split(" ");

		int L = Integer.parseInt(arr1[0]);
		int P = Integer.parseInt(arr1[1]);

		String[] arr2 = br.readLine().split(" ");

		for (String cnt : arr2) {
			System.out.print(-(L * P) + Integer.parseInt(cnt) + " ");
		}
		br.close();
	}
}
