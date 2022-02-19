package sort;

/**
 * 이름 : 퀵정렬(Quick Sort)
 * 정의 : 기준 데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 방법
 * 시간 복잡도 : 이상적인 경우 분할이 절반씩 일어난다면 전체 연산 횟수로 O(NlogN)
 * 
 * @author kimsihwan
 *
 */
public class SelectSort {
	
	public static void quickSort(int[] arr, int start, int end) {
		// 원소가 1개인 경우 종료
		if(start >= end) return;
		// 피봇은 첫 번째 원소
		int pivot = start;
		int left = start + 1;
		int right = end;
		// 좌, 우가 엇갈릴때 까지
		while(left <= right) {
			// 피봇보다 큰 데이터를 찾을때 까지 반복
			while(left <= end && arr[left] <= arr[pivot]) left++;
			// 피봇보다 작은 데이터를 찾을때 까지 반복
			while(right > start && arr[right] >= arr[pivot]) right++;
			// 엇갈렸다면 작은 데이터와 피봇을 교체
			if(left > right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			}
			// 엇갈리지 않았다면 작은 데이터 큰 데이터를 교체
			else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		// 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
		quickSort(arr, start, right - 1);
		quickSort(arr, right + 1, end);
		
	}

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };
		
		quickSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
