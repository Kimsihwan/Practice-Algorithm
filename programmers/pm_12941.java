package programmers;

import java.util.Arrays;

public class pm_12941 {
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);

        //내림차순
        Arrays.sort(B);
        int[] B1 = new int[B.length];
        for(int i = 0; i < B.length; i++) {
            B1[i] = B[(B.length-1)-i];
        }

        int answer = 0;
        for(int i = 0; i < B.length; i++) {
            answer+=(A[i]*B1[i]);
        }

        return answer;
    }
}
