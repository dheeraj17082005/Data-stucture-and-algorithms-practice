/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        public ListNode reverse(ListNode head2){
        ListNode current = head2;
        ListNode previous = null;
        ListNode forward = null;
        while(current!=null){
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        return previous;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow.next==null){
            return head.val+slow.val;
        }
        ListNode head2 = slow;
        // slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        int currentSum = 0;
        while(i!=null && j!=null){
            int sum = 0;
            sum = i.val+j.val;
            currentSum = Math.max(currentSum,sum);
            i = i.next;
            j=j.next;
        }
        return currentSum;
    }
}