package programmers;

import java.util.*;

public class pm_12915 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
