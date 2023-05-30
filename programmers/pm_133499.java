package programmers;

import java.util.HashMap;


public class pm_133499 {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String babb : babbling) {
            babb = babb.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            babb = babb.replaceAll("aya|ye|woo|ma", "");
            if(babb.equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
