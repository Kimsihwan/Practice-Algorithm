import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1654 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long [] arr = new long[K];
        for(int i = 0; i < K; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long min = 0;
        long max = Integer.MAX_VALUE+1l;

        while(min < max) {
            long mid = min + ((max-min)/2);

            long cnt = 0;
            for(int i = 0; i < K; i++) {
                cnt += (arr[i]/mid);
            }

            if(cnt < N) {
                max = mid;
            } else {
                min = mid+1;
            }
        }

        System.out.println(max-1);


    }
}