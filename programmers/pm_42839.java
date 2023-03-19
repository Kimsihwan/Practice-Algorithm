package programmers;

import java.util.HashSet;
import java.util.Iterator;

public class pm_42839 {

    HashSet<Integer> numberSet = new HashSet<>();
    public void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if(!comb.equals("")) {
            numberSet.add(Integer.valueOf(comb));
        }

        // 2. 남은 숫자 중 한개를 더 해 새로운 조합을 만든다.
        for(int i = 0; i < others.length(); i++) {
            recursive(comb+others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    public int solution(String numbers) {
        int count = 0;
        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);

        // 2. 소수의 개수만 센다.
        Iterator<Integer> it = numberSet.iterator();
        while(it.hasNext()) {
            int number = it.next();
            if(isPrime(number)) {
                count++;
            }
        }
        // 3. 소수의 개수를 반환한다.
        return count;
    }

    public boolean isPrime(int number) {

        // 1. 0과 1은 소수가 아니다.
        if(0 == number || 1 == number) {
            return false;
        }

        // 2. 에라토스테네스의 체의 limit을 계산한다.
        double sqrt = Math.sqrt(number);

        // 3. 소수점을 버린다.
        long round = Math.round(sqrt);

        // 4. 에라토스테네스의 체에 따라 limit까지만 배수 여부를 확인한다.
        for(long i = 2l; i <= round; i++) {
            if(number % i == 0l) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        pm_42839 sol = new pm_42839();
        System.out.println("sol = " + sol.solution("17"));
    }
}