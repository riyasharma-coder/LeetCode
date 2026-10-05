class Pair{
    int num;
    int freq;
    Pair(int num, int freq){
        this.num = num;
        this.freq = freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.freq, b.freq)
        );

        int[] ans = new int[k];
        int t = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(), entry.getValue()));
            
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            Pair node = pq.poll();
            ans[t++] = node.num;
        }
        
        return ans;
    }
}