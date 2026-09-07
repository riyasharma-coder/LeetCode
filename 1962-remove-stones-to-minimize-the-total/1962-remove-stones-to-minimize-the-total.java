class Solution {
    public int minStoneSum(int[] piles, int k) {
        int n = piles.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            pq.add(piles[i]);
        }

        while(k>0){
            int num = pq.poll();

            pq.add((num + 1) / 2);
            k--;
        }

        int sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }

        return sum;
    }
}