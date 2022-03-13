package programmers;

/**
 * 이름 : 자연수 뒤집어 배열로 만들기 
 * url : https://programmers.co.kr/learn/courses/30/lessons/12932
 * 
 * @author kimsihwan
 *
 */
public class pm_12932 {
	public int[] solution(long n) {
		   
		   String str = String.valueOf(n);
		   
		   StringBuilder sb = new StringBuilder();
		   sb.append(str);
		   StringBuilder reverse = sb.reverse();
		   
		   String[] arr = reverse.toString().split("");
		   
		   int[] answer = new int[arr.length];
		   
		   for(int i = 0; i < arr.length; i++) {
			   answer[i] = Integer.valueOf(arr[i]); 
		   }	   
		   
	       
	       return answer;
	   }
}
