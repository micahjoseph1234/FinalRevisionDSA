1class Solution {
2    public int bfs(int row, int col, int[][] visited,int[][] grid,int n,int m)
3    {
4        Queue<int[]> q= new LinkedList<>();
5        visited[row][col]=1;
6        q.offer(new int[]{row,col});
7        int[] rowT={1,0,-1,0};
8        int[] colT={0,-1,0,1};
9        int c=0;
10        while(!q.isEmpty())
11        {
12            int [] a= q.poll();
13            c++;
14            int i=a[0];
15            int j=a[1];
16           
17          
18            for(int k=0;k<4;k++)
19            {
20                int ri=i+rowT[k];
21                int ci=j+colT[k];
22                if(ri<0 || ci<0 || ri>=n || ci>=m || visited[ri][ci]==1 )
23                {
24                    continue;
25                }
26                if(grid[ri][ci]==1 && visited[ri][ci]==0 )
27                {
28                     visited[ri][ci]=1;
29                    q.offer(new int[]{ri,ci});
30                
31
32
33
34                }
35            }
36        }
37        return c;
38    }
39    public int maxAreaOfIsland(int[][] grid) {
40         int n= grid.length;
41        int m= grid[0].length;
42        int [][] visited= new int[n][m];
43        int ans=0;
44        for(int i=0;i<n;i++)
45        {
46            for(int j=0;j<m;j++)
47            {
48                if(grid[i][j]==1 && visited[i][j]==0)
49                {
50                   
51                    int c=bfs(i,j,visited,grid,n,m);
52                    ans=Math.max(ans,c);
53
54                }
55            }
56
57        }
58        return ans;
59        
60    }
61}