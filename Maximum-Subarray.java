1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum=0;
4        int maxi=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++)
6        {
7            sum+=nums[i];
8            maxi=Math.max(sum,maxi);
9            if(sum<0)
10            {
11              
12                sum=0;
13            }
14           
15                 
16
17            
18           
19        }
20        return maxi;
21
22        
23    }
24}