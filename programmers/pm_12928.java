package programmers;

import java.util.List;
import java.util.ArrayList;
/**
 * 이름 : 약수의 합 
 * url : https://programmers.co.kr/learn/courses/30/lessons/12928
 * 
 * @author kimsihwan
 *
 */
public class pm_12932 {
    public int solution(int n) {
		int sqrt = (int) Math.sqrt(n);
		
		
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= sqrt; i++) {
			if(n % i == 0) {
				list.add(i);
				
				if(n/i != i) {
					list.add(n/i);
				}
			}
		}
		
		return list.stream().mapToInt(i->i).sum();
    }
}
