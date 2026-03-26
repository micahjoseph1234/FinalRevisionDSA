1class Solution {
2    public void comb(int start, int n, int [] candidates, int target,List<List<Integer>> list, List<Integer> list1)
3    {
4          if (target == 0) {
5            list.add(new ArrayList<>(list1));
6            return;
7        }
8
9        if (target < 0) return;
10        for(int i=start;i<n;i++)
11        {
12            list1.add(candidates[i]);
13            comb(i,n,candidates,target-candidates[i],list,list1);
14            list1.remove(list1.size()-1);
15            
16        }
17    }
18    public List<List<Integer>> combinationSum(int[] candidates, int target) {
19        List<List<Integer>> list= new ArrayList<>();
20        List<Integer> list1= new ArrayList<>();
21        comb(0,candidates.length,candidates,target,list,list1);
22        return list;
23        
24    }
25}