package programmers;

import java.util.*;

public class pm_120852 {

    static boolean[] prime = new boolean[10001];

    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        makePrime();

        while(n!=1) {
            for(int i = 0; i < prime.length; i++) {
                if(!prime[i] && n % i == 0) {
                    n/=i;
                    if(!list.contains(i)) {
                        list.add(i);
                    }
                    break;
                }
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public void makePrime() {
        prime[0] = prime[1] = true;
        for(int i = 2; i * i <  prime.length; i++) {
            for(int j = i * i; j < prime.length; j+=i) {
                if(!prime[j]) {
                    prime[j] = true;
                }
            }
        }
    }

}
