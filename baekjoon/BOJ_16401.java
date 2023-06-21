import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_16401 {
    static int M;
    static int N;
    static long[] arr;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new long[M];
        st = new StringTokenizer(br.readLine(), " ");
        long max = 0;
        for(int i = 0; i < M; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        Arrays.sort(arr);

        long min = 0l;
        max++;
        long mid = 0;

        while(min < max) {
            mid = min + ((max-min)/2l);

            if(mid == 0) {
                min = 1l;
                break;
            }

            long cnt = 0l;
            for(int i = 0; i < M; i++) {
                cnt += (arr[i]/mid);
            }

            if(cnt < N) {
                max = mid;
            } else {
                min = mid+1l;
            }
        }

        System.out.println(min-1l);

    }
}