package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class pm_120860 {
    public int solution(int[][] dots) {
        int answer = 0;

        int x1 = dots[0][0];
        int x2 = dots[1][0];
        if(x1 != dots[2][0]) {
            x2 = dots[2][0];
        } else if(x1 != dots[3][0]) {
            x2 = dots[3][0];
        }

        int i = 0;
        int tmp = x1;
        if(x1 < x2) {
            x1 = x2;
            x2 = tmp;
        }
        while(x1 != x2) {
            x1++;
            i++;
        }

        x1 = dots[0][0];
        int x = i;


        int y1 = dots[0][1];
        int y2 = dots[1][1];
        if(y1 != dots[2][1]) {
            y2 = dots[2][1];
        } else if(y1 != dots[3][1]) {
            y2 = dots[3][1];
        }

        i = 0;
        tmp = y1;
        if(y1 < y2) {
            y1 = y2;
            y2 = tmp;
        }
        while(y1 != y2) {
            y1++;
            i++;
        }
        int y = i;

        return x*y;
    }
}
