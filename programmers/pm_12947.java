package programmers;

/**
 * 이름 : 하샤드 수 
 * url : https://programmers.co.kr/learn/courses/30/lessons/12947
 * 
 * @author kimsihwan
 *
 */
public class pm_12947 {
	 public boolean solution(int x) {       
	       char[] charArray = String.valueOf(x).toCharArray();
	       
	       int sum = 0;
	       for(char a : charArray) {
				sum += (a - '0');
	       }       
	       return x % sum == 0 ? true : false;
	       }
}
