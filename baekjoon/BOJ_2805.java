import java.io.*;
import java.util.*;

public class BOJ_2805 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int lo = 0;
        int hi = 2000000001;

        int answer = 0;

        while(lo < hi) {
            int mid = lo + ((hi-lo)/2);

            long sum = 0l;
            for(int i = 0; i < arr.length; i++) {
                if(mid < arr[i]) sum += (arr[i]-mid);
            }

            if(M <= sum) {
                answer = mid;
                lo = mid+1;
            } else {
                hi = mid;
            }
        }

        System.out.println(answer);


    }
}