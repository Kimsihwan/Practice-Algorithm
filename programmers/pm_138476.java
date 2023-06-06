package programmers;

import java.util.*;

public class pm_138476 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> sizeMap = new HashMap<>();

        for(int size : tangerine) {
            sizeMap.put(size, sizeMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> keyList = new ArrayList<>(sizeMap.keySet());

        keyList.sort((o1, o2) -> sizeMap.get(o2) - sizeMap.get(o1));

        int i = 0;
        while(k > 0) {
            k -= sizeMap.get(keyList.get(i));
            answer++;
            i++;
        }

        return answer;
    }

}
