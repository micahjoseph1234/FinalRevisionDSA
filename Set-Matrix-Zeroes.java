1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int n= matrix.length;
4        int m= matrix[0].length;
5        
6        int col0=1;
7        for(int i=0;i<n;i++)
8        {
9            if(matrix[i][0]==0)
10            {
11                col0=0;
12            }
13            for(int j=1;j<m;j++)
14            {
15               
16                
17                    
18                        if(matrix[i][j]==0)
19                        {
20                            matrix[i][0]=0;
21                            matrix[0][j]=0;
22                        }
23                    
24            }
25        }
26        for(int i=n-1;i>0;i--)
27        {
28            for(int j=m-1;j>0;j--)
29            {
30                if(matrix[i][j]==0)
31                {
32                    continue;
33                }
34                if(matrix[i][0]==0 || matrix[0][j]==0)
35                {
36                    matrix[i][j]=0;
37                }
38            }
39        }
40        for(int j=1;j<m;j++)
41        {
42            if(matrix[0][0]==0)
43            {
44                matrix[0][j]=0;
45            }
46
47
48        }
49        for(int i=0;i<n;i++)
50        {
51            if(col0==0)
52            {
53                matrix[i][0]=0;
54            }
55        }
56        
57    }
58}