import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_11650 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Pair> list = new ArrayList<>();
        while(N-- > 0) {
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            list.add(new Pair(x, y));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(Pair p : list) {
            sb.append(p.x+" "+p.y);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static class Pair implements Comparable<Pair> {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }


        public int compareTo(Pair o) {
            if(this.x < o.x) {
                return -1;
            } else if(this.x == o.x) {
                if(this.y < o.y) {
                    return -1;
                } else if(this.y == o.y) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }

    }
}