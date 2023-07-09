package leetcode;

import java.util.*;

public class lc_22 {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        process(n, 0, 0, "", ret);
        return ret;
    }

    public void process(int n, int numOpen, int numClosed, String str, List<String> ret) {
        if(numOpen == n && numClosed == n) {
            ret.add(str);
            return;
        }

        if(numOpen < n) {
            process(n, numOpen+1, numClosed, str+"(", ret);
        }
        if(numOpen > numClosed) {

            process(n, numOpen, numClosed+1, str+")", ret);
        }
    }
}
