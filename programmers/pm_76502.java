package programmers;

import java.util.*;

public class pm_76502 {
    public int solution(String s) {
        int answer = 0;

        int T = s.length() - 1;

        while (T-- > 0) {
            char[] arr = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            for (char c : arr) {
                if (c == '(' || c == '{' || c == '[') stack.push(c);
                else {
                    if (stack.isEmpty()) {
                        stack.push(c);
                        break;
                    } else {
                        if (stack.peek() == '(' && c == ')') stack.pop();
                        else if (stack.peek() == '{' && c == '}') stack.pop();
                        else if (stack.peek() == '[' && c == ']') stack.pop();
                    }
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }

            char tmp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = tmp;
            s = new String(arr);
        }

        return answer;
    }
}
