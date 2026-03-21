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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13            if(l1==null)
14            {
15                return l2;
16            }
17            if(l2==null)
18            {
19                return l1;
20            }
21           int carry=0;
22           
23           ListNode dummyNode = new ListNode(-1);
24           ListNode temp=dummyNode;
25           while(l1!=null || l2!=null)
26           {
27            int sum=carry;
28            if(l1!=null)
29            {
30                sum+=l1.val;
31            }
32            if(l2!=null)
33            {
34                sum+=l2.val;
35            }
36            carry = sum/10;
37            ListNode newNode= new ListNode(sum%10);
38            temp.next=newNode;
39            temp=temp.next;
40            if(l1!=null)
41            {
42                l1=l1.next;
43            }
44            if(l2!=null)
45            {
46                l2=l2.next;
47            }
48           }
49           if(carry!=0)
50           {
51            ListNode newNode= new ListNode(carry);
52            temp.next=newNode;
53           }
54           return dummyNode.next;
55        
56    }
57}