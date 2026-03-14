1class Solution {
2    public double calculate(double x, long n)
3    {
4        if(n==0)
5        {
6            return 1.0;
7        }
8       
9        if(n%2==0)
10        {
11             return calculate(x*x , n/2);
12        }
13        else
14        {
15            return x*calculate(x,n-1);
16        }
17    }
18    public double myPow(double x, int n) {
19        long N = n;
20        if(N<0)
21        {
22            x = (1/x);
23            N= -1 *(N);
24        }
25        return calculate(x,N);
26        
27    }
28}