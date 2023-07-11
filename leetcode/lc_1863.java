package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_1863 {

    static boolean[] visited;
    static int N = 0;
    static List<Integer> list;
    static List<Integer> list2;
    public int subsetXORSum(int[] nums) {
        N = nums.length;
        visited = new boolean[N];
        list = new ArrayList<>();
        list2 = new ArrayList<>();

        backTrack(nums, 0, 0);

        int sum = 0;
        for(int v : list2) {
            sum += v;
        }

        return sum;
    }

    static void backTrack(int[] nums, int at, int depth) {
        for(int i = at; i < N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            list.add(nums[i]);
            int sum = list.get(0);
            for(int j = 1; j < list.size(); j++) {
                sum ^= list.get(j);
            }
            list2.add(sum);
            backTrack(nums, i+1, depth+1);
            visited[i] = false;
            list.remove(Integer.valueOf(nums[i]));
        }
    }
}
