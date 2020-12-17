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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
    {
        ListNode prev=null,next=null,list=list1;
        
        while(b!=0)
        {
           
            if(a==1)
                prev=list1;
             list1=list1.next;
            a--;
            b--;
            
        }
        next=list1.next;
        prev.next=list2;
        
        while(list2.next!=null)
        {
            list2=list2.next;
        }
        list2.next=next;
        
        return list;
        
        }
    }
