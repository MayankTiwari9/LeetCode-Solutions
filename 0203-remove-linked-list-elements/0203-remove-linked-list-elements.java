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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        
        while(head != null && head.val == val)
            head = head.next;
        
        ListNode prevNode = head;
        ListNode nextNode = head;
        
        while(nextNode != null){
            if(nextNode.val == val){
                prevNode.next = nextNode.next;
                nextNode = nextNode.next;
            }
            else{
                prevNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        return head;
    }
}