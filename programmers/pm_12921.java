package programmers;

/**
 * 이름 : 소수 찾기
 * url : https://school.programmers.co.kr/learn/courses/30/lessons/12921
 *
 * @author kimsihwan
 *
 */
public class pm_12921 {

    // true : 합성수, false : 소수
    private static boolean[] prime;

    public int solution(int n) {
        int answer = 0;
        make_prime(n);


        for(int i = 0; i < prime.length; i++) {
            if(!prime[i]){
                answer++;
            }
        }
        return answer;
    }


    private void make_prime(int n) {
        prime = new boolean[n+1]; // 0 ~ N

        if(n < 2) {
            return;
        }

        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(n); i++) {

            if(prime[i]) {
                continue;
            }

            for(int j = i * i; j < prime.length; j = j+i){
                prime[j]  = true;
            }
        }
    }

}

