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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nHead = new ListNode();
        ListNode curr = nHead;
        
        int cnt = 0;
        
        while(l1 != null || l2 != null){
            int sum = 0 + cnt;
            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }
            
            cnt = (sum / 10);
            
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if(cnt == 1)
            curr.next = new ListNode(1);
        
        return nHead.next;
    }
}