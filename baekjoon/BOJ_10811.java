import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_10811 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[] arr2 = new int[N];
        int[] arr3 = new int[N];
        for(int i = 0; i < N; i++) {
            arr2[i] = i;
        }
        arr3 = arr2.clone();

        while(M-- > 0) {
            arr = br.readLine().split(" ");
            int i = Integer.parseInt(arr[0])-1;
            int j = Integer.parseInt(arr[1])-1;
            int tmp = j;
            for(int l = i; l <= j; l++) {
                arr2[l] = arr3[tmp];
                tmp--;
            }
            arr3 = arr2.clone();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append((arr2[i]+1)+" ");
        }

        System.out.println(sb);

    }
}