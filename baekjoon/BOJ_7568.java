import java.util.*;
import java.io.*;

public class BOJ_7568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int grade = 1;
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i][0] = x; // 몸무게
            arr[i][1] = y; // 키
        }

        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(i == j) continue; // 같은 사람은 비교할 필요 업슴

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            System.out.print(rank+" ");
        }
    }
}