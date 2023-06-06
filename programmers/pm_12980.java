package programmers;

import java.util.HashSet;
import java.util.Set;

public class pm_12980 {
    public int solution(int n) {
        int ans = 0;

        while(n!=0) {
            System.out.println(n);
            if(n%2 == 0) {
                n/=2;
            } else {
                n--;
                ans++;
            }
        }

        return ans;
    }
}
