class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            Collections.reverseOrder(Map.Entry.comparingByValue())
        );

        pq.addAll(map.entrySet());


        int[] ans = new int[k];
        int t=0;
        while(k>0){
            ans[t++] = pq.poll().getKey();
            k--;
        }
        return ans;
    }
}