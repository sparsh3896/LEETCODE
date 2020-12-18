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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
      ListNode prev= null,curr=null;
        int c1=0,c2=0;
        while(l1!=null)
        {
            curr=l1;
            l1=l1.next;
            curr.next=prev;
            prev=curr;
            c1++;
        }
        ListNode prev1= null,curr1=null;
        
        while(l2!=null)
        {
            curr1=l2;
            l2=l2.next;
            curr1.next=prev1;
            prev1=curr1;
            c2++;
        }
        
        ListNode ans=prev;
        if(c1>=c2)
        {
            while(prev!=null)
            {
                if(prev1!=null)
                {
                    if(prev.val+prev1.val>9)
                    {
                    prev.val=(prev.val+prev1.val)%10;
                        if(prev.next!=null)
                    prev.next.val=prev.next.val+1;
                        else
                        {
                           ListNode extra= new ListNode();
                                prev.next=extra;
                            extra.val=1; 
                        }
                    prev=prev.next;
                    prev1=prev1.next;
                    }
                    else
                    {
                    prev.val=prev.val+prev1.val;
                    prev=prev.next;
                    prev1=prev1.next;   
                    }
                }
                else
                {
                    if(prev.val>9)
                    {
                        prev.val=0;
                        if(prev.next!=null)
                        prev.next.val+=1;
                        else
                        {
                            ListNode extra= new ListNode();
                                prev.next=extra;
                            extra.val=1;
                        }
                        prev=prev.next;
                    }
                    else
                        break;
                }
            }
            ListNode prevv=null,current=null;
           while(ans!=null)
            {
            current=ans;
            ans=ans.next;
            current.next=prevv;
               prevv=current;
             }
            return prevv;
        }
        ListNode ans1=prev1;
        ListNode prevv1= null,current1=null;
        if(c1<=c2)
         {
            while(prev1!=null)
            {
                if(prev!=null)
                {
                    if(prev.val+prev1.val>9)
                    {
                    prev1.val=(prev.val+prev1.val)%10;
                    prev1.next.val=prev1.next.val+1;
                    prev1=prev1.next;
                    prev=prev.next;
                    }
                    else
                    {
                    prev1.val=prev1.val+prev.val;
                    prev1=prev1.next;
                    prev=prev.next;   
                    }
                }
                else
                {
                    if(prev1.val>9)
                    {
                        prev1.val=0;
                        if(prev1.next!=null)
                        prev1.next.val+=1;
                        else
                        {
                           ListNode extra= new ListNode();
                                prev1.next=extra;
                            extra.val=1; 
                        }
                        prev1=prev1.next;
                    }
                    else
                        break;
                }
                
            }
           
        
        while(ans1!=null)
        {
            current1=ans1;
            ans1=ans1.next;
            current1.next=prevv1;
            prevv1=current1;
            
        } 
        } 
        return prevv1;
        
    }
}

// this approach reverses both the link list and then compute the sum accordingly
