import java.io.*;
import java.util.*;

public class BOJ_10816 {
    static int[] arr;
    static StringTokenizer st;
    static int target;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            target = Integer.parseInt(st.nextToken());
            int firstIdx = firstBinarySearch();
            int lastIdx = lastBinarySearch();
            sb.append((lastIdx-firstIdx+1)+" ");
        }

        System.out.println(sb);
    }

    static int lastBinarySearch() {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start+end) / 2;
            if(arr[mid] <= target) {
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return end;
    }

    static int firstBinarySearch() {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start+end) / 2;
            if(arr[mid] < target) {
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        return start;
    }
}