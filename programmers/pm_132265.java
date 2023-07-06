package programmers;

import java.util.*;

public class pm_132265 {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> second = new HashMap<>();

        for(int v : topping) {
            first.put(v, first.getOrDefault(v, 0)+1);
        }

        for(int v : topping) {
            second.put(v, second.getOrDefault(v,0)+1);
            if(first.get(v)-1 == 0) {
                first.remove(v);
            } else {
                first.put(v, first.get(v)-1);
            }

            if(first.size() == second.size()) {
                answer++;
            }
        }
        return answer;
    }
}
