1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        int c1=0,c2=0;
4        int e1=0,e2=0;
5        int n=nums.length;
6        for(int i=0;i<n;i++)
7        {
8            if(c1==0 && nums[i]!=e2)
9            {
10                c1=1;
11                e1=nums[i];
12            }
13            else if(c2==0 && nums[i]!=e1)
14            {
15                c2=1;
16                e2=nums[i];
17            }
18            else if(nums[i]==e1)
19            {
20                c1++;
21            }
22            else if(nums[i]==e2)
23            {
24                c2++;
25            }
26            else
27            {
28                c1--;
29                c2--;
30            }
31        }
32    
33        List<Integer> l1= new ArrayList<>();
34        int count=0,count1=0;
35        for(int i=0;i<n;i++)
36        {
37            if(nums[i]==e1)
38            {
39                count++;
40            }
41            else if(nums[i]==e2)
42            {
43                count1++;
44            }
45        }
46        if(count>n/3)
47        {
48            l1.add(e1);
49
50        }
51        if(count1>n/3)
52        {
53            l1.add(e2);
54        }
55        
56     
57        return l1;
58        
59    }
60}