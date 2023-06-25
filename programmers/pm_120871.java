package programmers;

import java.util.ArrayList;

public class pm_120871 {
    public int solution(int n) {
        int answer = 1;

        for(int i = 1; i < n; i++) {
            answer++;

            while((answer % 3 == 0
                    || answer % 10 == 3
                    || answer / 10 == 3
                    || answer / 100 == 3
                    || (answer % 100) / 10 == 3
                    || (answer % 100) % 10 == 3)) {
                answer++;
            }

        }
        return answer;
    }
}
