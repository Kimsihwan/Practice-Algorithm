import java.io.*;
import java.util.*;

public class BOJ_1431 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Guitar> list = new ArrayList();

        while (N-- > 0) {
            String sn = br.readLine();
            list.add(new Guitar(sn));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (Guitar g : list) {
            sb.append(g.name);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static class Guitar implements Comparable<Guitar> {
        String name;

        Guitar(String name) {
            this.name = name;
        }


        public int compareTo(Guitar o) {
            if (this.name.length() < o.name.length()) {
                return -1;
            } else if (this.name.length() == o.name.length()) {
                char[] arr1 = this.name.toCharArray();
                char[] arr2 = o.name.toCharArray();
                int sum1 = 0;
                int sum2 = 0;
                for (int i = 0; i < arr1.length; i++) {
                    int v1 = arr1[i] - '0';
                    if (0 <= v1 && 9 >= v1) {
                        sum1 += v1;
                    }
                    int v2 = arr2[i] - '0';
                    if (0 <= v2 && 9 >= v2) {
                        sum2 += v2;
                    }
                }

                if (sum1 == sum2) {
                    return this.name.compareTo(o.name);
                } else {
                    return Integer.compare(sum1, sum2);
                }

            } else {
                return 1;
            }
        }
    }
}