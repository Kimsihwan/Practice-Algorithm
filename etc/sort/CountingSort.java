package etc.sort;

/**
 * 이름 : 계수정렬(Counting Sort)
 * 정의 : 특정한 조건이 부합할 때만 사용할 수 있지만 매우 빠르게 동작하는 정렬 알고리즘(데이터 크기 범위가 제한되어 정수 형태로 표현할 수 있을때 까지 사용 가능)
 * 시간 복잡도 : 평균 O(N), 데이터의 개수 K, 데이터(양수) 중 최댓값이 K일 때 최악의 경우에도 수행 시간 O(N+K)를 보장
 * 
 * @author kimsihwan
 *
 */
public class CountingSort {
	
	static final int MAX_VALUE = 9;
	
	public static void main(String[] args) {
		int n = 15;
		// 모든 원소의 값이 0보다 크거나 같다고 가정
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        // 모든 범위를 포함하는 배열 선언(모든 값은 0으로 초기화)
		int[] cnt = new int[MAX_VALUE + 1];
		
		for(int i = 0; i < n; i++) {
			cnt[arr[i]] += 1; // 각 데이터에 해당하는 인덱스의 값 증가
		}
		
		for (int i = 0; i <= MAX_VALUE; i++) { // 배열에 기록된 정렬 정보 확인
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print(i + " ");
			}
		}
	}
}
