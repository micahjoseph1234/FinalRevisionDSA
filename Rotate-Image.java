1class Solution {
2    public void transpose(int [][] matrix)
3    {
4        int n= matrix.length;
5        int m = matrix[0].length;
6        for(int i=0;i<n;i++)
7        {
8            for(int j=0;j<=i;j++)
9            {
10                int temp= matrix[i][j];
11                matrix[i][j]=matrix[j][i];
12                matrix[j][i]=temp;
13            }
14        }
15    }
16    public void reverse(int [][] matrix)
17    {
18        int n= matrix.length;
19        int m= matrix[0].length;
20        for(int i=0;i<n;i++)
21        {
22            int low=0,high=m-1;
23            while(low<=high)
24            {
25                int temp= matrix[i][low];
26                matrix[i][low]=matrix[i][high];
27                matrix[i][high]=temp;
28                low++;
29                high--;
30            }
31        }
32    }
33    public void rotate(int[][] matrix) {
34        transpose(matrix);
35        reverse(matrix);
36        
37    }
38}