import java.io.*;
import java.util.*;

public class BOJ_11931 {
    static int N;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        while(N-- > 0) {
            list.add(Integer.parseInt(br.readLine()));
        }


        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int v : list) {
            sb.append(v);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}