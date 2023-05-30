package programmers;


public class pm_160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i = 0; i < targets.length; i++) {
            String target = targets[i];
            char[] arr = target.toCharArray();
            int cnt = 0;

            // target arr
            for(int j = 0; j < arr.length; j++) {
                char c = arr[j];
                int min = Integer.MAX_VALUE;
                for(String key : keymap) {
                    char[] keyArr = key.toCharArray();
                    for(int k = 0; k < keyArr.length; k++) {
                        if(c == keyArr[k]) {
                            min = Math.min(min, k+1);
                            break;
                        }
                    }
                }
                if(min == Integer.MAX_VALUE) {
                    cnt = -1;
                    break;
                }
                if(min != Integer.MAX_VALUE) cnt += min;
            }

            answer[i] = cnt;
        }

        return answer;
    }
}
