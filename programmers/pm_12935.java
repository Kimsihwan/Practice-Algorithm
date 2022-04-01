package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * 이름 : 제일 작은 수 제거하기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12935
 * 
 * @author kimsihwan
 *
 */
public class pm_12935 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        }
		int min = Integer.MAX_VALUE;
		
		List<Integer> list = new ArrayList<Integer>();
		
		int idx = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				idx = i;
			}
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			if(i == idx) continue;
			list.add(arr[i]);
		}
		
		return list.stream().mapToInt(i->i).toArray();
	}
}
