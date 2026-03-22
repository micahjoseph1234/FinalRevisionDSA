1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverse(ListNode head) {
13        /* Initialize 'temp' at 
14         * head of linked list */
15        ListNode temp = head;
16        
17        /* Initialize pointer 'prev' 
18         * to NULL, representing 
19         * the previous node */
20        ListNode prev = null;
21        
22        // Continue till 'temp' 
23        // reaches the end (NULL)
24        while (temp != null) {
25            /* Store the next node in 'front' 
26             * to preserve the reference */
27            ListNode front = temp.next;
28            
29            /* Reverse the direction of the 
30             * current node's 'next' pointer 
31             * to point to 'prev' */
32            temp.next = prev;
33            
34            /* Move 'prev' to the current 
35             * node for the next iteration */
36            prev = temp;
37            
38            /* Move 'temp' to the 'front' node 
39             * advancing the traversal */
40            temp = front;
41        }
42        
43        // Return the new head 
44        // of the reversed linked list
45        return prev;
46    }
47    public boolean isPalindrome(ListNode head) {
48        ListNode slow=head;
49        ListNode fast=head;
50        while(fast.next!=null && fast.next.next!=null)
51        {
52            slow=slow.next;
53            fast=fast.next.next;
54        }
55        ListNode newHead= reverse(slow.next);
56        ListNode temp=slow.next;
57        
58        while(newHead!=null)
59        {
60            if(newHead.val!=head.val)
61            {
62                reverse(temp);
63                return false;
64            }
65            newHead=newHead.next;
66            head=head.next;
67        }
68        reverse(temp);
69        return true;
70      
71        
72    }
73}