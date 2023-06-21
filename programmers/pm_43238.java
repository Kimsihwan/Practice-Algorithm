package programmers;

import java.util.*;

public class pm_43238 {
    public long solution(int n, int[] times) {

        Arrays.sort(times);

        long min = 0l;
        long max = ((long) times[times.length-1]*n)+1l;
        long mid = 0l;
        long answer = Long.MAX_VALUE;
        while(min < max) {
            mid = min + ((max-min)/2l);

            long cnt = 0;
            for(int i = 0; i < times.length; i++) {
                cnt += (mid/times[i]);
            }

            if(cnt < n) {
                min = mid+1l;
            } else {
                max = mid;
            }
        }

        return max;
    }
}
