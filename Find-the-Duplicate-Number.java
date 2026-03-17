1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n=nums.length;
4        int slow=nums[0];
5        int fast=nums[0];
6
7        slow= nums[slow];
8        fast =nums[nums[fast]];
9        while(slow!=fast)
10        {
11            slow=nums[slow];
12            fast=nums[nums[fast]];
13        }
14        fast=nums[0];
15        while(slow!=fast)
16        {
17            slow=nums[slow];
18            fast = nums[fast];
19        }
20        return slow;
21        
22    }
23}