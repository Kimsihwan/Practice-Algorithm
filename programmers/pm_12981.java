package programmers;

import java.util.*;

public class pm_12981 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        set.add(words[0]);
        int person = 2;
        int game = 1;
        for(int i = 1; i < words.length; i++) {
            if(person > n)  {
                person = 1;
                game++;
            }
            if(set.contains(words[i]) || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                answer[0] = person;
                answer[1] = game;
                break;
            }
            set.add(words[i]);
            person++;
        }

        return answer;
    }
}
