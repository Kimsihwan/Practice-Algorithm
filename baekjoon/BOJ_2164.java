

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 카드2
 * url : https://www.acmicpc.net/problem/2164
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2164 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i = 1; i<=N; i++) {
			q.add(i);
		}
		
		while(q.size() != 1) {
			q.poll();
			q.offer(q.poll());
		}
		
		System.out.println(q.peek());
		sc.close();
		
		
		// 직접 구현
		
//		/**
//		 * 한 턴에 1개 씩 삭제되고 뒤에 1개가 추가 되므로
//		 * 2 * N - 1의 공간이 필요하다.
//		 * 다만 index는 1부터 시작할 것이기 때문에
//		 * 2 * N 공간으로 생성한다.
//		 */
//		int[] arr = new int[2 * N];
//		for(int i = 1; i <= N; i++) {
//			arr[i] = 1;
//		}
//		
//		int prevIndex = 1;
//		int lastIndex = N;
//		
//		while(N-- > 1) {
//			prevIndex++;
//			arr[lastIndex + 1] = arr[prevIndex];
//			lastIndex++;
//			prevIndex++;
//		}
//		System.out.println(arr[prevIndex]);		
	}
}
