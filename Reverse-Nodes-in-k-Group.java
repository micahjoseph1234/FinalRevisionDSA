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
12    public ListNode findKthNode(ListNode temp, int k) {
13    k--; // move k-1 times
14    while (temp != null && k > 0) {
15        temp = temp.next;
16        k--;
17    }
18    return temp;
19}
20    public ListNode reverse(ListNode head) {
21        /* Initialize 'temp' at 
22         * head of linked list */
23        ListNode temp = head;
24        
25        /* Initialize pointer 'prev' 
26         * to NULL, representing 
27         * the previous node */
28        ListNode prev = null;
29        
30        // Continue till 'temp' 
31        // reaches the end (NULL)
32        while (temp != null) {
33            /* Store the next node in 'front' 
34             * to preserve the reference */
35            ListNode front = temp.next;
36            
37            /* Reverse the direction of the 
38             * current node's 'next' pointer 
39             * to point to 'prev' */
40            temp.next = prev;
41            
42            /* Move 'prev' to the current 
43             * node for the next iteration */
44            prev = temp;
45            
46            /* Move 'temp' to the 'front' node 
47             * advancing the traversal */
48            temp = front;
49        }
50        
51        // Return the new head 
52        // of the reversed linked list
53        return prev;
54    }
55    public ListNode reverseKGroup(ListNode head, int k) {
56        ListNode temp=head;
57        ListNode prev=null;
58        while(temp!=null)
59        {
60            ListNode kthNode=findKthNode(temp,k);
61            if(kthNode==null)
62            {
63                if(prev!=null)
64                {
65                    prev.next=temp;
66
67                }
68                
69                break;
70            }
71            ListNode nextNode = kthNode.next;
72            kthNode.next=null;
73           ListNode newHead = reverse(temp);
74
75if (temp == head) {
76    head = newHead;
77} else {
78    prev.next = newHead;
79}
80            prev =temp;
81            temp=nextNode;
82        }
83        return head;
84        
85    }
86}