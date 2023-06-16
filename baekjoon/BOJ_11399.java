import java.util.*;

public class BOJ_11399 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int prefix_sum = 0;
        int sum = 0;
        for(int i = 0; i<N; i++) {
            sum += (prefix_sum+arr[i]);

            prefix_sum += arr[i];
        }

        System.out.println(sum);

    }
}