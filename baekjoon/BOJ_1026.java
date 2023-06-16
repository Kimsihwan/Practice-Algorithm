import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_1026 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] arr1 = new Integer[N];
        Integer[] arr2 = new Integer[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1, new Comparator<>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        Arrays.sort(arr2, new Comparator<>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr1[i]*arr2[i];
        }

        System.out.println(sum);
    }
}