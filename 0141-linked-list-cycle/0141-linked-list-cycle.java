public class Solution {
    public boolean hasCycle(ListNode head) {
         while (head != null) {
            if (head.val == 1_000_000) return true;
            head.val = 1_000_000;
            head = head.next;
        }
        return false;
    }
}