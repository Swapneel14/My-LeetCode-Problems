//Hard
class MedianFinder {
    private PriorityQueue<Integer>lh=new PriorityQueue<>((a,b)->Integer.compare(b,a));
    private PriorityQueue<Integer>rh=new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
       

        rh.offer(num);
        lh.offer(rh.poll());

        if(rh.size()<lh.size()){
            rh.offer(lh.poll());
        }

        
    }
    
    public double findMedian() {
        if(rh.size()>lh.size())return (double)(rh.peek());
        else{
            return (double)(rh.peek()+lh.peek())/2;
        }
        
    }
}

