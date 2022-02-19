package sort;

/**
 * 이름 : 선택정렬(Select Sort)
 * 정의 : 처리되지 않은 데이터 중에서 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸는 것을 반복
 * 시간 복잡도 : N번 만큼 가장 작은 수를 찾아서 맨 앞에 보내야 하기 때문에 O(N^2)
 * 
 * @author kimsihwan
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 0; i < n; i++) {
			int minIndex = i; // 가장 작은 원소의 인덱스
			// 가장 작은 원소 찾기
			for (int j = i + 1; j < n; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			// 처리되지 않은 데이터 중 맨앞과 제일 작은 데이터를 선택해서
			// 스와프
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
