import java.io.*;
import java.util.*;

public class BOJ_2295 {
    static int N;
    static int[] arr;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                list.add(arr[i]+arr[j]);
            }
        }

        Collections.sort(list);

        for(int k = arr.length-1; k >= 0; k--) {
            for(int z = k; z >= 0; z--) {
                int value = arr[k] - arr[z];
                if(binarySearch(value) > -1) {
                    System.out.println(arr[k]);
                    return;
                }
            }
        }
    }

    public static int binarySearch(int value) {
        int lo = 0;
        int hi = list.size();
        int answer = -1;

        while(lo < hi) {
            int mid = lo + ((hi-lo)/2);

            if(list.get(mid) == value) {
                return mid;
            } else if(list.get(mid) < value) {
                lo = mid+1;
            } else {
                hi = mid;
            }
        }


        return -1;
    }
}