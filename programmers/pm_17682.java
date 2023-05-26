package programmers;

public class pm_17682 {
    public int solution(String dartResult) {
        int answer = 0;
        char[] arr = dartResult.toCharArray();
        int[] scores = new int[3];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= '0' && arr[i] <= '9') {
                if(arr[i+1] >= '0' && arr[i+1] <= '9') {
                    scores[idx] = 10;
                    i++;
                } else {
                    scores[idx] = arr[i] -'0';
                }
                idx++;
            } else if(arr[i] == 'S' || arr[i] == 'D' || arr[i] == 'T') {
                char next = arr[i];
                int current = scores[idx-1];
                switch(next) {
                    case 'S': current = (int)Math.pow(current, 1); break;
                    case 'D': current = (int)Math.pow(current, 2); break;
                    case 'T': current = (int)Math.pow(current, 3); break;
                }
                scores[idx-1] = current;
            } else if(arr[i] == '*') {
                if(idx != 1) {
                    scores[idx-2] *= 2;
                }
                scores[idx-1] *= 2;
            } else if(arr[i] == '#') {
                scores[idx-1] *= -1;
            }
        }

        for(int i = 0; i < 3; i++) {
            answer += scores[i];
        }

        return answer;
    }
}
