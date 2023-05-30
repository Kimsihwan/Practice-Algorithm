package programmers;

import java.util.*;
import java.math.*;

public class pm_131128 {
    public String solution(String X, String Y) {
        int[] arr = new int[10];

        for(int i = 0; i < Y.length(); i++) {
            int n = Y.charAt(i) - '0';
            arr[n]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < X.length(); i++) {
            int n = X.charAt(i) - '0';
            if(arr[n] > 0) {
                arr[n]--;
                sb.append(n);
            }
        }

        if(sb.length() == 0) return "-1";
        if(sb.toString().charAt(0) == '0') return "0";

        char[] charArr = sb.toString().toCharArray();

        Arrays.sort(charArr);
        sb = new StringBuilder();
        for(int i = charArr.length -1; i >= 0; i--) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }
}
