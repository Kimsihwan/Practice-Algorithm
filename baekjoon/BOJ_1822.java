import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1822 {
    static int N;
    static int M;
    static long[] arr1;
    static long[] arr2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        arr1 = new long[N];
        M = Integer.parseInt(st.nextToken());
        arr2 = new long[M];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr1[i] = Long.parseLong(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            arr2[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < N; i++) {
            long v = arr1[i];

            int lo = 0;
            int hi = arr2.length;

            int answer = -1;
            while(lo < hi) {
                int mid = lo + ((hi-lo)/2);

                if(arr2[mid] == v) {
                    answer = mid;
                    break;
                } else if(arr2[mid] > v) {
                    hi = mid;
                } else {
                    lo = mid+1;
                }
            }

            if(answer == -1) {
                count++;
                sb.append(v+" ");
            }
        }

        System.out.println(count);
        if(count != 0) {
            System.out.println(sb);
        }
    }
}