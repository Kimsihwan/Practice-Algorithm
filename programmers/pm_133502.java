package programmers;

import java.util.*;


public class pm_133502 {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int v : ingredient) {
            stack.push(v);

            int cnt = 4;
            if(stack.size() >= cnt) {
                if(stack.get(stack.size() - 4) == 1 &&
                        stack.get(stack.size() - 3) == 2 &&
                        stack.get(stack.size() - 2) == 3 &&
                        stack.get(stack.size() - 1) == 1 ) {
                    answer++;

                    while(cnt-- > 0) {
                        stack.pop();
                    }
                }
            }
        }

        return answer;
    }
}
