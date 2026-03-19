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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
         Arrays.fill(arr[i], -1);
       }
        ArrayList<Integer> nodes = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            nodes.add(temp.val);
            temp = temp.next;
        }
        
        int fr = 0;
        int lr = m-1;
        int fc = 0;
        int lc = n-1;
        int idx = 0;
      
        while(fr<=lr && fc<=lc){
            
            for(int j = fc; j<=lc && idx <nodes.size(); j++){
                arr[fr][j] = nodes.get(idx++);  
            }
            fr++;
            for(int i = fr;i<=lr && idx < nodes.size();i++){
               arr[i][lc] = nodes.get(idx++);    
            }
            lc--;
            for(int j = lc;j>=fc && idx < nodes.size();j--){
                arr[lr][j] = nodes.get(idx++);  
            }
            lr--;
            for(int i = lr;i>=fr && idx < nodes.size();i--){
                arr[i][fc] = nodes.get(idx++); 
            }
            fc++;
        }
        return arr;
    }
}