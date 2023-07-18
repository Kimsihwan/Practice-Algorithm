package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc_876 {

    // 워커 러너 테크닉
    // walke : 한번에 한칸씩
    // runner : 한번에 두칸씩
    // runner가 끝날때쯤 walker가 중간에 와있음
    // 구현을 위한 브레인 스토밍
    // 짝수
    // walker : 1 2
    // runner : 1 2 nullX

    // 홀수
    // walker : 1 2X 3
    // runner : 1 2  3 nullX

    // runner 1칸 전진 워커 1칸 전진 러너 1칸 전진
    public ListNode middleNode(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while(runner != null) {
            runner = runner.next;
            if(runner != null) {
                walker = walker.next;
                runner = runner.next;
            }
        }
        return walker;
    }


     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
