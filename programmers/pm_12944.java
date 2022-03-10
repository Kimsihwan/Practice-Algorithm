package programmers;

/**
 * 이름 : 평균 구하기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12944
 * 
 * @author kimsihwan
 *
 */
public class pm_42746 {
	
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int value : arr){
            answer += value;
        }
        
        return answer/arr.length;
    }

}
