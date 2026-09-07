class MedianFinder {

    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;
    public MedianFinder() {
        max = new PriorityQueue<>(Collections.reverseOrder());
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(max.isEmpty()){
            max.add(num);
            return;
        }

        if(max.peek()<num){
            min.add(num);
        }else{
            max.add(num);
        }
        
        int diff = min.size()-max.size();
        if(diff==1){
            max.add(min.poll());
        }else if(diff<-1){
            min.add(max.poll());
        }
    }
    
    public double findMedian() {
        double ans = 0;
        if(max.size()==min.size()){
            int mini = max.peek();
            int maxi = min.peek();

           ans = (double) (mini + maxi) / 2; 

        }else{
            ans = max.peek();
        }
        return ans;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */