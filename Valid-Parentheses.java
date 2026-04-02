1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> st= new Stack<>();
4     
5        for(int i=0;i<s.length();i++)
6        {
7            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
8            {
9                st.push(s.charAt(i));
10            }
11            else
12            {
13                if(st.isEmpty())
14                {
15                    return false;
16                }
17                else
18                {
19                    if(s.charAt(i)==')' && st.peek()=='(')
20                    {
21                        st.pop();
22                    }
23                    else if(s.charAt(i)==']' && st.peek()=='[')
24                    {
25                        st.pop();
26                    }
27                    else if(s.charAt(i)=='}' && st.peek()=='{')
28                    {
29                        st.pop();
30                    }
31                    else
32                    {
33                        return false;
34                    }
35                }
36            }
37        }
38        if(st.isEmpty())
39        {
40            return true;
41        }
42        return false;
43        
44    }
45}