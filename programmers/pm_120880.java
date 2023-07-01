package programmers;


public class pm_120880 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];


        for(int i = 0; i < answer.length; i++) {
            int gap = Integer.MAX_VALUE;
            int v = 0;
            int idx = 0;
            for(int j = 0; j < numlist.length; j++) {
                if(numlist[j] == 0) continue;
                if(gap > Math.abs(n-numlist[j])) {
                    v = numlist[j];
                    gap = Math.abs(n-numlist[j]);
                    idx = j;
                } else if(gap == Math.abs(n-numlist[j]) && v < numlist[j]) {
                    v = numlist[j];
                    idx = j;
                }
            }
            answer[i] = v;
            numlist[idx] = 0;
        }
        return answer;
    }
}
