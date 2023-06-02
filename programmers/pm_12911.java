package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class pm_12911 {
    public int solution(int n) {
        char[] arr = String.valueOf(Integer.toBinaryString(n)).toCharArray();
        int cnt = 0;
        for(char c : arr) {
            if(c == '1') cnt++;
        }
        while(true) {
            n++;
            char[] cArr = String.valueOf(Integer.toBinaryString(n)).toCharArray();
            int cCnt = 0;
            for(char c : cArr) {
                if(c == '1') cCnt++;
            }
            if(cnt == cCnt) break;
        }

        return n;
    }
}
