package programmers;

import java.util.*;

public class pm_176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for(int i = 0; i < photo.length; i++) {
            String[] arr = photo[i];
            int sum = 0;
            for(String str : arr) {
                sum += map.getOrDefault(str,0);
            }

            answer[i] = sum;
        }

        return answer;
    }
}
