1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for(int i=0;i<nums.length;i++)
5        {
6            pq.offer(nums[i]);
7            if(pq.size()>k)
8            {
9                pq.poll();
10            }
11        }
12        return pq.peek();
13       
14        
15    }
16}