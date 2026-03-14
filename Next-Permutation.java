1class Solution {
2     public void reverse(int[] nums,int low, int high)
3    {
4        while(low<=high)
5        {
6            int temp=nums[low];
7            nums[low]=nums[high];
8            nums[high]=temp;
9            low++;
10            high--;
11        }
12    }
13    public void nextPermutation(int[] nums) {
14        int ind=-1;
15        int n=nums.length;
16        for(int i=n-2;i>=0;i--)
17        {
18            if(nums[i]<nums[i+1])
19            {
20                ind=i;
21                break;
22            }
23        }
24        if(ind==-1)
25        {
26            reverse(nums,0,n-1);
27        }
28        else
29        {
30            for(int i=n-1;i>=ind;i--)
31            {
32                if(nums[i]>nums[ind])
33                {
34                    int temp=nums[ind];
35                    nums[ind]=nums[i];
36                    nums[i]=temp;
37                    break;
38                }
39            }
40            reverse(nums,ind+1,n-1);
41
42        }
43
44        
45    }
46}