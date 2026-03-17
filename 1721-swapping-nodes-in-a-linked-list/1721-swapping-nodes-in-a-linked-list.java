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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        if(head==null || head.next==null) return head;
        for(int i = 1;i<k;i++){
            fast = fast.next;
        }
        int temp1 = fast.val;
        ListNode node1 = fast;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        int temp2 = slow.val;
        node1.val = temp2;
        slow.val = temp1;
        return head;
    }
}