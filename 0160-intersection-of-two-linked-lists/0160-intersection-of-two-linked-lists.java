/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
    int length1 = 0, length2 = 0;
    ListNode temp1 = head1, temp2 = head2;
    while(temp1 != null){
        length1++;
        temp1 = temp1.next;
    }
    while(temp2 != null){
        length2++;
        temp2 = temp2.next;
    }
    temp1 = head1;
    temp2 = head2;
    int diff = Math.abs(length1 - length2);
    if(length1 > length2){
        for(int i = 0; i < diff; i++) temp1 = temp1.next;
    } else {
        for(int i = 0; i < diff; i++) temp2 = temp2.next;
    }
    while(temp1 != null && temp2 != null){
        if(temp1 == temp2) return temp1;
        temp1 = temp1.next;
        temp2 = temp2.next;
    }
    return null;
}
    }
