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
    public int[] nextLargerNodes(ListNode head) 
    {
        ListNode head1=head;
        int c=0,i=0;
        
        while(head1!=null)
        {
            head1=head1.next;
            c++;
        }
       int [] arr= new int[c];
        
        while(head.next!=null)
        {
            ListNode temp= head.next;
            
            while(temp!=null)
            {
                if(temp.val>head.val)
                {
                    arr[i]=temp.val;
                    break;
                }
                temp=temp.next;
            }
            head=head.next;
            i=i+1;
        }
        
        return arr;
    }
}

// time complexity of this approach is O(n^2) we can do in n time complexity using stack
