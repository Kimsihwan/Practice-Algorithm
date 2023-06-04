package programmers;

import java.util.*;

public class pm_12973 {
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();
        for(char c : arr) {
            if(stack.isEmpty()) stack.push(c);
            else if(stack.peek() == c) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
