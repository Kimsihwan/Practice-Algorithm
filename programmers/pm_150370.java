package programmers;

import java.util.*;

public class pm_150370 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int date = getDate(today);

        for(String s : terms) {
            String[] term = s.split(" ");
            map.put(term[0], Integer.parseInt(term[1]));
        }

        for(int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= date) {
                list.add(i + 1);
            }
        }


        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private int getDate(String today) {
        String[] date = today.split("[.]");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
