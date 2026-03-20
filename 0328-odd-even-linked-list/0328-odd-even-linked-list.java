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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = head;// starts at 1st node
        ListNode even = head.next;// starts at 2nd node
        ListNode evenHead = even;// save start of even list

        while(even != null && even.next != null){
            odd.next = even.next;// link odd to next odd
            odd = odd.next;
            even.next = odd.next;// link even to next even
            even = even.next;
        }
        odd.next = evenHead;// attach even list after odd
        return head;//remember all the connections sequence and try to dry run all of them as it is very important odd even is necessary for segregate odd even list questions and many more 
    }
}