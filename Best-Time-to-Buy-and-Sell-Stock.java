1class Solution {
2    public int maxProfit(int[] prices) {
3       int [] arr= new int[prices.length];
4       int maxi= Integer.MIN_VALUE;
5       for(int i=prices.length-1;i>=0;i--)
6       {
7        maxi=Math.max(maxi,prices[i]);
8        arr[i]=maxi;
9           
10       }
11       for(int i=0;i<prices.length;i++)
12       {
13        System.out.println(arr[i]);
14       }
15       int maxSum=0;
16       int mini=Integer.MAX_VALUE;
17       for(int i=0;i<prices.length;i++)
18       {
19          mini=Math.min(mini,prices[i]);
20          maxSum=Math.max(arr[i]-mini,maxSum);
21       }
22        return maxSum;
23    }
24}