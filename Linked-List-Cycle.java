1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        if(head==null || head.next==null)
15        {
16            return false;
17        }
18        ListNode slow=head;
19        ListNode fast=head;
20        while (fast!=null && fast.next!=null) {
21            slow = slow.next;
22            fast = fast.next.next;
23            if(slow==fast)
24            {
25                return true;
26            }
27        }
28        return false;
29        
30       
31      
32        
33    }
34}