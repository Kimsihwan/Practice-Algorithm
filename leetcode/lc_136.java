package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_136 {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int num : nums) {
            ret ^= num;
        }
        return ret;
    }
}
