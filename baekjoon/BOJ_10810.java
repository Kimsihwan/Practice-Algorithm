import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_10810 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int[] arr2 = new int[N];

        for(int n = 0; n < M; n++) {
            arr = br.readLine().split(" ");
            int i = Integer.parseInt(arr[0])-1;
            int j = Integer.parseInt(arr[1])-1;
            int k = Integer.parseInt(arr[2]);

            for(int l = i; l <= j; l++){
                arr2[l] = k;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(arr2[i]+" ");
        }

        System.out.println(sb);
    }
}