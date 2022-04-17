import java.util.Scanner;

/**
 * 이름 : 열 개씩 끊어 출력하기
 * url : https://www.acmicpc.net/problem/11721
 * 
 * @author kimsihwan
 *
 */
public class BOJ_11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		for (int i = 0; i < input.length(); ++i) {
			System.out.print(input.charAt(i));
			if (i % 10 == 9) {
				System.out.println();
			}
		}
	}

}
