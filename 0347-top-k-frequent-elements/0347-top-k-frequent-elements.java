class Pair{
    int node;
    int freq;

    Pair(int node, int freq){
        this.node = node;
        this.freq = freq;
    }
}

class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a.freq, b.freq)
        );
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(pq.size() >= k && pq.peek().freq < entry.getValue() ){
                pq.poll();
            }

            if(pq.size()<k){
                pq.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }

        int[] ans = new int[k];
        int t=0;
        while(!pq.isEmpty()){
            ans[t++] = pq.poll().node;
        }

        return ans;
    }
}