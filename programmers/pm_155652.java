package programmers;

import java.util.*;

public class pm_155652 {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        char[] arr = s.toCharArray();
        char[] skipArr = skip.toCharArray();

        List<Character> list = new ArrayList();
        for(char c : skipArr) {
            list.add(c);
        }

        for(int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            int cnt = 0;
            while(cnt < index) {
                ch++;
                if(ch > 'z') {
                    ch = 'a';
                }
                if(list.contains(ch)) {
                    continue;
                }
                cnt++;
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}