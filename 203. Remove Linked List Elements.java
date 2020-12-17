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
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode prev= null, ret= head;
         
        while(head!=null)
        {
            if(head.val== val)  // remove that node
            {
                if(prev!= null)     
                {
                    prev.next= head.next;
                    head= prev.next;
                }
                else
                {
                    ret= head.next;
                    head= head.next;
                }
            }
            else    // dont remove
            {
                prev= head;
                head= head.next;
            }
        }
        
        return ret;
    }
}
