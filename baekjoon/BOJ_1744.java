import java.io.*;
import java.util.*;

public class BOJ_1744 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Long> a = new ArrayList<>();
        List<Long> b = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            Long v = Long.valueOf(br.readLine());
            if(v <= 0L) {
                b.add(v);
            } else {
                a.add(v);
            }
        }

        // 내림차순
        Collections.sort(a, Collections.reverseOrder());
        // 오름차순
        Collections.sort(b);

        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == a.size()-1) {
                sum += a.get(i);
            } else {
                if(a.get(i) == 1 || a.get(i+1) == 1) {
                    sum += (a.get(i) + a.get(i+1));
                } else {
                    sum += (a.get(i) * a.get(i+1));
                }
                i++;
            }
        }


        for(int i = 0; i < b.size(); i++) {
            if(i == b.size()-1) {
                sum += b.get(i);
            } else {
                sum += (b.get(i) * b.get(i+1));
                i++;
            }
        }

        System.out.println(sum);
    }
}