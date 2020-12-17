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
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) 
    {
        HashSet<ListNode> set = new HashSet<>();
           while(heada!=null)
           {
               set.add(heada);
               heada= heada.next;
           }
        while(headb!=null)
        {
            if(set.contains(headb))
                return headb;
            headb= headb.next;
        }
        return null;
        
    }
}


// IN THIS APPROACH WE ARE FINDING THE INTERSECTION NODE USING HASH SET
// TIME COMPLEXITY FOR THIS APPROACH IS O(M+N) THAT IS M TIME FOR FIRST HASHING LOOP AND N FOR 2ND SEARCH LOOP
