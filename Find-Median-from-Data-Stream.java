1class MedianFinder {
2    PriorityQueue<Integer> maxHeap;
3    PriorityQueue<Integer> minHeap;
4    int count=0;
5
6    public MedianFinder() {
7        maxHeap= new PriorityQueue<>((a,b)->(b-a));
8        minHeap= new PriorityQueue<>((a,b)->(a-b));
9        
10    }
11    
12    public void addNum(int num) {
13        maxHeap.offer(num);
14        minHeap.offer(maxHeap.poll());
15        if(maxHeap.size()<minHeap.size())
16        {
17            maxHeap.offer(minHeap.poll());
18        }
19        
20    }
21    
22    public double findMedian() {
23       if(maxHeap.size()==minHeap.size())
24       {
25        return (maxHeap.peek()+minHeap.peek())/2.0;
26       }
27       return maxHeap.peek();
28
29
30        
31    }
32}
33
34/**
35 * Your MedianFinder object will be instantiated and called as such:
36 * MedianFinder obj = new MedianFinder();
37 * obj.addNum(num);
38 * double param_2 = obj.findMedian();
39 */