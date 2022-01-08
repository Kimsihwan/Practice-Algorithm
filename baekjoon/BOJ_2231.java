
import java.io.IOException;
import java.util.Scanner;

/**
 * 이름 : 분해합 
 * url : https://www.acmicpc.net/problem/2231
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2231 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		// 자리수의 길이를 알기위해 일단 문자열로 입력 받는다.
		String str_N = sc.nextLine();
		int N_len = str_N.length();
		int N = Integer.parseInt(str_N);
		int result = 0;
		for (int i = N - (9 * N_len); i < N; i++) {
			int number = i;
			int sum = i; // 각 자리수 합 변수
			while (number != 0) {
				sum += (number % 10);
				number /= 10;
			}

			if (sum == N) {
				result = i;
				break;
			}
		}

		System.out.println(result);

		sc.close();
	}
}
