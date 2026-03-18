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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        ArrayList<ListNode> arr = new ArrayList<>();
        for(ListNode n : lists){
             arr.add(n);
        }
        while(arr.size()>1){
        ListNode a = arr.get(arr.size()-1);
        arr. remove (arr. size()-1);
        ListNode b = arr.get (arr.size()-1);
        arr. remove(arr.size()-1);
        ListNode c = merge (a, b);
        arr.add(c);
        }
        return arr.get(0);
    }
    public ListNode merge(ListNode a, ListNode b){
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;

    while(a != null && b != null){
        if(a.val <= b.val){
            tail.next = a;
            a = a.next;
        } else {
            tail.next = b;
            b = b.next;
        }
        tail = tail.next;
    }

    // attach remaining nodes
    if(a != null){
        tail.next = a;
    } else {
        tail.next = b;
    }

    return dummy.next;
}
}