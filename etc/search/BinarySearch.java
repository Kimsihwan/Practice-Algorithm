package etc.search;

import java.util.Scanner;

/**
 * 이름 : 이진탐색(Binary Search)
 * 정의 : 정렬되어 있는 리스트(배열)에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 방법
 * 시간 복잡도 : O(logN)
 * 
 * @author kimsihwan
 *
 */
public class BinarySearch {	
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		if(start > end) return -1;
		int mid = (start + end) / 2;
		// 찾은 경우 중간점 인덱스 반환
		if(arr[mid] == target) return mid;
		// 중간점 보다 찾고자 하는 값이 작은 경우 왼쪽 확인
		else if(arr[mid] > target) return binarySearch(arr, target, start, mid-1);
		// 중간점 보다 찾고자 하는 값이 클 경우 오른쪽 확인
		else return binarySearch(arr, target, mid+1, end);
	}
	
	public static void main(String[] args) {
		int n = 10;
		int target = 7;
		int[] arr = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		
		int result = binarySearch(arr, target, 0, n-1);
		if(result == -1) {
			System.out.println("원소가 존재하지 않습니다.");
		}else {
			System.out.println(result + 1);
		}
	}
}
