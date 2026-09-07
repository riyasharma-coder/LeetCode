class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = stones.length;
        for(int i=0; i<n; i++){
            pq.add(stones[i]);
        }

        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();

            int diff = first - second;
            if(diff>0){
                pq.add(diff);
            }
        }

        return pq.size()>0? pq.peek() : 0;
    }
}