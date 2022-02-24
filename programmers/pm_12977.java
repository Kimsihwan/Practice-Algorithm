package programmers;

/**
 * 이름 : x만큼 간격이 있는 n개의 숫자
 * url : https://programmers.co.kr/learn/courses/30/lessons/12977
 * 
 * @author kimsihwan
 *
 */
public class pm_12977 {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0 ; i < nums.length - 2; i++){
            for(int j = i+1; j < nums.length - 1; j++){
                for(int k = j+1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int l = 2;
                    answer++;
                    while(l < sum){
                        if(sum % l == 0){
                            answer--;
                            break;
                        }
                        l++;
                    }
                }
            }
        }
        return answer;
    }
}
