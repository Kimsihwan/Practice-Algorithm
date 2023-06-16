import java.util.*;

public class BOJ_2217 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Integer max = 0;
        for(int i = 0 ; i < N; i++) {
            max = Math.max(max, arr[i] * (i+1));
        }

        System.out.println(max);
    }
}