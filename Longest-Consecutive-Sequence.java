1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> st= new HashSet<>();
4        int n=nums.length;
5        int maxi=0;
6        for(int i=0;i<n;i++)
7        {
8            st.add(nums[i]);
9        }
10        for(int i:st)
11        {
12            int start=i;
13            if(!st.contains(start-1))
14            {
15                int count=0;
16                while(st.contains(start))
17                {
18                    count++;
19                    maxi=Math.max(count,maxi);
20                    start=start+1;
21                }
22            }
23        }
24        return maxi;
25    }
26}