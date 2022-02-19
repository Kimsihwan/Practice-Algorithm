package etc.sort;

/**
 * 이름 : 삽입정렬(Insert Sort)
 * 정의 : 처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입합니다.
 * 시간 복잡도 : 반복문이 두번 중첩되어 사용 O(N^2)
 * 
 * @author kimsihwan
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int n = 10;
		int[] arr = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

		for (int i = 1; i < n; i++) {
			// 인덱스 i부터 1까지 감소하며 반복(본인기준 앞쪽 정렬된 데이터들)
			for (int j = i; j > 0; j--) {
				// 한 칸씩 왼쪽으로 이동
				if (arr[j] < arr[j - 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
				// 자기보다 작은 데이터를 만나면 그 위치에서 멈춤(왜나면 그 앞에는 이미 정렬이 되어 있기 때문)
				else break;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
