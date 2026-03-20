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
12    public ListNode reverseList(ListNode head) {
13        ListNode prev =null;
14        while(head!=null)
15        {
16            ListNode temp =head.next;
17            head.next=prev;
18            prev=head;
19            head=temp;
20        }
21        return prev;
22        
23    }
24}