package programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * 이름 : 같은 숫자는 싫어
 * url : https://programmers.co.kr/learn/courses/30/lessons/12906
 * 
 * @author kimsihwan
 *
 */
public class pm_12906 {
	public int[] solution(int[] arr) {		
		List<Integer> list = new ArrayList<Integer>();
		int prev = -1;
		for(int v : arr) {
			if(prev != v) {
				list.add(v);
				prev = v;
			}
		}
		
		return list.stream().mapToInt(i->i).toArray();
    }

}
