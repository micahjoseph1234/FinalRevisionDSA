1class Solution {
2    int count=0;
3    public void merge(int low,int mid, int high, int [] nums)
4    {
5        int [] ans= new int[high-low+1];
6        int l=0;
7        int i=low,j=mid, k=mid+1, n=high;
8        int o = mid + 1;
9            for(int t = low; t <= mid; t++) {
10                while(o <= high && nums[t] > 2L * nums[o]) {
11                    o++;
12                }
13                count += (o - (mid + 1));
14            }
15        
16
17        while(i<=j && k<=n)
18        {
19            if(nums[i]<=nums[k])
20            {
21                ans[l]=nums[i];
22                i++;
23                l++;
24                
25            }
26            else
27            {
28                
29                ans[l]=nums[k];
30                l++;
31                k++;
32            }
33
34        }
35        while(i<=j)
36        {
37            ans[l]=nums[i];
38            l++;
39            i++;
40        }
41         while(k<=n)
42        {
43            ans[l]=nums[k];
44            l++;
45            k++;
46        }
47        int p=0,q=ans.length-1;
48       
49        for(int m=0;m<ans.length;m++)
50        {
51            nums[m+low]=ans[m];
52        }
53
54    }
55    public void mergeSort(int low, int high, int [] nums)
56    {
57        if(low>=high)
58        {
59            return;
60        }
61        int mid= low+(high-low)/2;
62        mergeSort(low,mid,nums);
63        mergeSort(mid+1,high,nums);
64        merge(low,mid,high,nums);
65    }
66    public int reversePairs(int[] nums) {
67        mergeSort(0,nums.length-1,nums);
68        return count;
69        
70    }
71}