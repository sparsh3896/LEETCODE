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
    public boolean isPalindrome(ListNode head) 
{
    ListNode fast = head, slow = head;
    while (fast != null && fast.next != null) 
    {
        fast = fast.next.next;
        slow = slow.next;
        
    }
    if (fast != null) 
    { 
        slow = slow.next;
    }
        ListNode prev=null,curr=null;
    
        while(slow!=null)
    {
        curr=slow;
        slow=slow.next;
        curr.next=prev;
        prev=curr;
        
    }
    slow = prev;
    fast = head;
    
    while (slow != null) 
    {
        if (fast.val != slow.val)
        {
            return false;
        }
        fast = fast.next;
        slow = slow.next;
        
    }
    return true;
  }
}


// we are using floyd,s tortoise and hare algorith to reach the middle node and then we are dividing the link list in 2 parts and reversing the second part then traversing 
both the list at the same time to check palindrome;//
