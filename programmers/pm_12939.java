package programmers;

/**
 * 이름 : 최댓값과 최솟값
 * url : https://programmers.co.kr/learn/courses/30/lessons/12939
 * 
 * @author kimsihwan
 *
 */
public class pm_12939 {
	
    public String solution(String s) {
        String answer = "";
        String[] split = s.split(" ");		
		Integer min = Integer.MAX_VALUE;
		Integer max = Integer.MIN_VALUE;
		
		for(String v : split) {
			Integer valueOf = Integer.valueOf(v);
			
			min = Math.min(min, valueOf);
			max = Math.max(max, valueOf);
		}
        
        return min + " " + max;
    }

}
