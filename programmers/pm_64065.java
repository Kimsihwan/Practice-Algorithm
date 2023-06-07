package programmers;

import java.util.*;

public class pm_64065 {
    public int[] solution(String s) {

        String[] arr = s.replaceAll("[{}]", " ").trim().split(" , ");
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        //Arrays.sort(arr, (s1, s2) -> s2.length() - s1.length());

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(String str : arr) {
            StringTokenizer st = new StringTokenizer(str, ",");
            while(st.hasMoreTokens()) {
                set.add(Integer.parseInt(st.nextToken()));
            }
        }


        int[] answer = new int[set.size()];
        List<Integer> list = new ArrayList<>(set);
        for(int i = 0; i < set.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}