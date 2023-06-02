package programmers;


public class pm_12951 {
    public String solution(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(i == 0 || arr[i-1] == ' ') {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
