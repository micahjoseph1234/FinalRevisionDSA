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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13   
14        if(list1==null && list2==null)
15        {
16            return null;
17        }
18        if(list1==null)
19        {
20            return list2;
21        }
22        if(list2==null)
23        {
24            return list1;
25        }
26        ListNode dummy = new ListNode(-1);
27        ListNode temp=dummy;
28        while(list1!=null && list2!=null)
29        {
30            
31                if(list1.val<=list2.val)
32                {
33                   temp.next=list1;
34                   list1=list1.next;
35                }
36                else
37                {
38                    temp.next=list2;
39                    list2=list2.next;
40
41                }
42                temp=temp.next;
43
44            
45            
46           
47        }
48        if(list1!=null)
49            {
50                
51                temp.next=list1;
52            }
53             if(list2!=null)
54            {
55                temp.next=list2;
56            }
57         return dummy.next;
58        
59    }
60}