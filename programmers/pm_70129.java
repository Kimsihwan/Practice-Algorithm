package programmers;
public class pm_70129 {
    public int[] solution(String s) {
        int a = 0;
        int b = 0;
        while(!s.equals("1")) {
            String[] arr = s.split("");
            String tmp = "";
            for(String str : arr) {
                if(str.equals("0")) {
                    b++;
                } else {
                    tmp+=str;
                }
            }
            s = String.valueOf(Integer.toBinaryString(tmp.length()));
            a++;
        }
        return new int[]{a, b};
    }
}
