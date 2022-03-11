package programmers;

/**
 * 이름 : 정수 내림차순으로 배치하기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12933
 * 
 * @author kimsihwan
 *
 */
public class pm_12933 {	

    public long solution(long n) {
        long answer = 0;
        
        String[] arr = String.valueOf(n).split("");
        Integer[] arr1 = new Integer[arr.length];
        
        for(int i = 0 ; i < arr.length; i++){
            arr1[i] = Integer.valueOf(arr[i]);
        }
        
        Arrays.sort(arr1, Collections.reverseOrder());
        
        String value = "";
        
        for(Integer v : arr1){
            value+= v;
        }
        
        return Long.valueOf(value).longValue();
    }

}
