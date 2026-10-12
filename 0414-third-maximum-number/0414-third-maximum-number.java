class Solution {
    public int thirdMax(int[] nums) {
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(set);

        if(pq.size()<3){
            return pq.poll();
        }else if(pq.size()>=3){
            for(int i=0; i<2; i++){
                pq.poll();
            }
            return pq.poll();
        }
        return -1;  

    }
}