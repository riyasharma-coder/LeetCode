class Solution {
    public int lastStoneWeight(int[] stones) {
        
        int n = stones.length;

        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        for(int stone : stones){
            maxHeap.add(stone);
        }

        while(maxHeap.size()>1){
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            int res = y-x;
            if( res != 0){
                maxHeap.add(res);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }

        return maxHeap.peek();
    }
}