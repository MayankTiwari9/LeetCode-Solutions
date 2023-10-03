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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        
        for(ListNode curr = headA; curr != null; curr = curr.next)
            lenA++;
        
        for(ListNode curr = headB; curr != null; curr = curr.next)
            lenB++;
        
        int d = Math.abs(lenA - lenB);
        
        ListNode nCurrA = headA;
        ListNode nCurrB = headB;
        
        // if(lenA > lenB){
        //     for(int i=0;i<d;i++)
        //         nCurrA = nCurrA.next;
        // }
        // else{
        //     for(int i=0;i<d;i++)
        //         nCurrB = nCurrB.next;
        // }
        
        for(int i=0;i<d;i++){
            if(lenA > lenB)
                nCurrA = nCurrA.next;
            else
                nCurrB = nCurrB.next;
        }
        
        while(nCurrA != null && nCurrB != null){
            if(nCurrA == nCurrB){
                return nCurrA;
            }else{
                nCurrA = nCurrA.next;
                nCurrB = nCurrB.next;
            }
        }
        
        return null;
    }
}