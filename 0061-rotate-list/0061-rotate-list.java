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
    public int length(ListNode head){
        int length = 0;
        while(head!=null){
            head = head.next;
            length++;
        }
        return length;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int len = length(head);
        k = k%len;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0;i<=k;i++){
            fast = fast.next;
        }
        
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode t = a;
        while(t.next!=null){
            t = t.next;
        }
        t.next = head;
        return a;
    }
}