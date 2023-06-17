import java.io.*;
import java.util.*;

public class BOJ_2457 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Flower[] arr = new Flower[N];
        for( int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int startMonth = Integer.parseInt(st.nextToken())*100;
            int startDay = Integer.parseInt(st.nextToken());
            int endMonth = Integer.parseInt(st.nextToken())*100;
            int endDay = Integer.parseInt(st.nextToken());
            arr[i] = new Flower(startMonth+startDay, endMonth+endDay);
        }

        Arrays.sort(arr);

        int start = 301;
        int end = 1201;
        int index = 0;
        int max = 0;

        int count = 0;

        while(start < end) {
            boolean flag = false;
            for(int i = index; i < N; i++) {
                if(start < arr[i].start) {
                    break;
                }

                if(max < arr[i].end) {
                    flag = true;
                    max = arr[i].end;
                    index = i+1;
                }
            }

            if(flag) {
                start = max;
                count++;
            } else {
                break;
            }
        }

        if(max < end) {
            System.out.println(0);
        } else {
            System.out.println(count);
        }

    }

    static class Flower implements Comparable<Flower> {
        int start;
        int end;

        Flower(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Flower f) {
            // start 내림차순
            if(this.start < f.start) {
                return -1;
            } else if (this.start == f.start) {
                // end 오름차순
                if(this.end > f.end) {
                    return -1;
                } else if(this.end == f.end) {
                    return 0;
                } return 1;
            } else {
                return 1;
            }

        }
    }
}