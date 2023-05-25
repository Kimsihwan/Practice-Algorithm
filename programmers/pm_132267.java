package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class pm_132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a) {
            int x = (n/a)*b;
            answer+= x;
            n = x+(n%a);
        }
        return answer;
    }
}
