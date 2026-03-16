1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> mpp = new HashMap<>();
4        int n=nums.length;
5        mpp.put(0,1);
6        int sum=0,count=0;
7        for(int i=0;i<n;i++)
8        {
9            sum+=nums[i];
10            if(mpp.containsKey(sum-k)==true)
11            {
12                count+=mpp.get(sum-k);
13             
14               
15
16            }
17             mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
18        }
19        return count;
20        
21    }
22}