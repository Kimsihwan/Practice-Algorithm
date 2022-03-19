package programmers;

/**
 * 이름 : 수박수박수박수박수박수?
 * url : https://programmers.co.kr/learn/courses/30/lessons/12922
 * 
 * @author kimsihwan
 *
 */
public class pm_12922 {
	
    public String solution(int n) {
        String answer = "";
        
        for(int i = 1; i <=n;i++){
            if(i%2==0){
                answer+="박";
            }else{
                answer+="수";
            }
        }
        
        return answer;
    }

}
