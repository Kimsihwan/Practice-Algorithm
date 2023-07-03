import java.io.*;
import java.util.*;

public class BOJ_2304 {
    static int N;
    static int[] arr = new int[1001];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int start = Integer.MAX_VALUE;
        int end = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            arr[L] = H;
            start = Math.min(start, L);
            end = Math.max(end, L);
        }

        Stack<Integer> stack = new Stack<>();
        // 왼쪽 비교
        int temp = arr[start];
        for(int i = start+1; i <= end; i++) {
            if(arr[i] < temp) {
                stack.push(i);
            } else {
                while(!stack.isEmpty()) {
                    int x = stack.pop();
                    arr[x] = temp;
                }
                temp = arr[i];
            }
        }

        stack.clear();

        // 오른쪽 비교
        temp = arr[end];
        for(int i = end-1; i >= 0; i--) {
            if(arr[i] < temp) {
                stack.push(i);
            } else {
                while(!stack.isEmpty()) {
                    int x = stack.pop();
                    arr[x] = temp;
                }
                temp = arr[i];
            }
        }

        int result = 0;
        for(int i = start; i <= end; i++) {
            result += arr[i];
        }

        System.out.println(result);
    }
}