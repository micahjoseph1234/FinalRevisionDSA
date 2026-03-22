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
13    public ListNode detectCycle(ListNode head) {
14        if(head==null || head.next==null)
15        {
16            return null;
17        }
18        ListNode slow=head;
19        ListNode fast=head;
20        while(fast!=null && fast.next!=null)
21        {
22            slow=slow.next;
23            fast=fast.next.next;
24            if(slow==fast)
25            {
26                fast=head;
27                break;
28            }
29        }
30        if(fast==null || fast.next==null)
31        {
32            return null;
33        }
34        while(fast!=slow)
35        {
36            slow=slow.next;
37            fast=fast.next;
38            
39        }
40        
41        return slow;
42        
43    }
44}