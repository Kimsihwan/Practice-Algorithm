package programmers;

import java.util.*;

public class pm_131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        int day = 10;

        Map<String, Integer> wantMap = new HashMap<>();

        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }


        for(int i = 0; i < (discount.length - day) + 1; i++) {
            Map<String, Integer> discountMap = new HashMap<>();

            for(int j = 0; j < day; j++) {
                String key = discount[i+j];
                discountMap.put(key, discountMap.getOrDefault(key, 0)+1);
            }

            boolean flag = true;
            for(String str : wantMap.keySet()) {
                Integer wantValue = wantMap.get(str);
                Integer discountValue =  discountMap.get(str);
                if(wantValue != discountValue) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }

        }

        return answer;
    }
}
