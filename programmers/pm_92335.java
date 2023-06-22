package programmers;

public class pm_92335 {

    public int solution(int n, int k) {
        int answer = 0;

        String str = Integer.toString(n, k);

        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != '0') {
                sb.append(arr[i]);
            } else if(sb.length() != 0) {
                if(isPrime(Long.parseLong(sb.toString()))) {
                    answer++;
                }
                sb = new StringBuilder();
            }
        }

        if(sb.length() != 0) {
            if(isPrime(Long.parseLong(sb.toString()))) {
                answer++;
            }
        }

        return answer;
    }

    boolean isPrime(long v) {
        if(v == 0l || v == 1l) {
            return false;
        }

        long a = (long)Math.sqrt(v);
        for(long i = 2l; i <= a; i++) {
            if(v % i == 0l)  {
                return false;
            }
        }

        return true;
    }
}
