package programmers;

public class pm_12926 {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(('a'<= arr[i] && 'z' >= arr[i])) {
                int a = (int)arr[i]+n;
                if((char)a > 'z') {
                    a-=26;
                }
                arr[i] = (char) a;
            } else if(('A'<= arr[i] && 'Z' >= arr[i])) {
                int a = (int)arr[i]+n;
                if((char)a > 'Z') {
                    a-=26;
                }
                arr[i] = (char) a;
            }else {
                arr[i] = arr[i];
            }
        }
        return String.valueOf(arr);
    }
}
