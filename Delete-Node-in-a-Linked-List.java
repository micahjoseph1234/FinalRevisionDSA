1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) { val = x; }
7 * }
8 */
9class Solution {
10    public void deleteNode(ListNode node) {
11        ListNode temp=node.next;
12        int x=temp.val;
13        node.val=temp.val;
14        temp.val=x;
15        
16        node.next=temp.next;
17        temp.next=null;
18    
19
20
21        
22    }
23}