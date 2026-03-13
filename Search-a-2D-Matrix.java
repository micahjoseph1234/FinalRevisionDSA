1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int n= matrix.length;
4        int m= matrix[0].length;
5        
6        int low=0, high=(n*m)-1;
7        while(low<=high)
8        {
9            int mid = (low+(high-low)/2);
10            int nRow=mid/m;
11            int nCol=mid%m;
12            if(matrix[nRow][nCol]==target)
13            {
14                return true;
15            }
16            else if(matrix[nRow][nCol]>target)
17            {
18                high=mid-1;
19            }
20            else
21            {
22                low=mid+1;
23            }
24        }
25        return false;
26        
27    }
28}