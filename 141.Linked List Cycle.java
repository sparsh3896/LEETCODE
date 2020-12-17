/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
    if(head==null) 
        return false;
    ListNode A = head;
    ListNode B = head;
    while(A.next!=null && A.next.next!=null) 
    {
        A = A.next;
        B = B.next.next;
        
        if(A==B) 
            return true;
    }
    return false;
}
}

// tortoise and hare algorithm approach
// A moves step by step and B moves 2 steps at a time if it is a linked list cycle they will meet at some point for sure
