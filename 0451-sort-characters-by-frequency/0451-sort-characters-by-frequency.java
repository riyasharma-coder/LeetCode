class Pair{
    char key;
    int val;
    Pair(char key, int val){
        this.key = key;
        this.val = val;
    }
}
class Solution {
    public String frequencySort(String s) {

        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.val, a.val)
        );

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            char key = curr.key;
            int val = curr.val;

            for(int i=0; i<val; i++){
                sb.append(key);
            }
        }
        return sb.toString();
    }
}