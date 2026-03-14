1class Solution {
2    public int majorityElement(int[] nums) {
3        int count=1;
4        int elem=nums[0];
5        for(int i=1;i<nums.length;i++)
6        {
7            if(nums[i]==elem)
8            {
9                count++;
10            }
11            else
12            {
13                count--;
14            }
15            if(count<0)
16            {
17                elem=nums[i];
18                count=1;
19            }
20        }
21        
22        return elem;
23        
24    }
25}