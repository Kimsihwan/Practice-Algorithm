package programmers;

import java.util.*;

public class pm_154539 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < numbers.length; i++) {
            int value = numbers[i];
            while(!stack.isEmpty() && numbers[stack.peek()] < value) {
                answer[stack.pop()] = value;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
