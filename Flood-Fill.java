1class Solution {
2    class Pair{
3        int row;
4        int col;
5        Pair(int r, int c)
6        {
7            this.row=r;
8            this.col=c;
9        }
10    }
11    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
12        int n=image.length;
13        int m=image[0].length;
14        int [][] visited= new int[n][m];
15        for(int i=0;i<n;i++)
16        {
17            for(int j=0;j<m;j++)
18            {
19                visited[i][j]=0;
20            }
21        }
22        Queue<Pair> q= new LinkedList<>();
23
24        int startingColor=image[sr][sc];
25        image[sr][sc]=color;
26        visited[sr][sc]=1;
27        q.offer(new Pair(sr,sc));
28        
29   
30        int [] nR= {-1,0,1,0};
31        int [] nC= {0,-1,0,1};
32        q.offer(new Pair(sr,sc));
33        while(!q.isEmpty())
34        {
35            Pair p = q.poll();
36            int rowN=p.row;
37            int colN=p.col;
38            
39            for(int i=0;i<4;i++)
40            {
41                int newR= rowN+nR[i];
42                int newC=colN+nC[i];
43                if(newR<0 || newR>=n || newC<0 || newC>=m || visited[newR][newC]==1 || image[newR][newC]!=startingColor)
44                {
45                    continue;
46                }
47                
48                        visited[newR][newC]=1;
49                        image[newR][newC]=color;
50                        q.offer(new Pair(newR,newC));
51
52                    
53                
54                
55            }
56        }
57        return image;
58        
59    }
60}