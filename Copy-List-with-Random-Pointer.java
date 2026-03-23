1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        Node dummyNode = new Node(-1);
19        Node res= dummyNode;
20        Node temp=head;
21
22        while(temp!=null)
23        {
24            Node newNode = new Node(temp.val);
25            Node nextOldNode= temp.next;
26            temp.next=newNode;
27            newNode.next=nextOldNode;
28            temp=temp.next.next;
29        }
30        Node temp1=head;
31        
32        while(temp1!=null)
33        {
34            Node copyNode=temp1.next;
35            Node oldRandom= temp1.random;
36            if(temp1.random!=null)
37            {
38                copyNode.random=temp1.random.next;
39            }
40            else
41            {
42                copyNode.random=null;
43            }
44            temp1=temp1.next.next;
45         
46
47        }
48        Node temp2=head;
49        while(temp2!=null)
50        {
51            Node newNode=temp2.next;
52            res.next=newNode;
53            temp2.next=temp2.next.next;
54            res=newNode;
55            temp2=temp2.next;
56        }
57        return dummyNode.next;
58
59        
60    }
61}