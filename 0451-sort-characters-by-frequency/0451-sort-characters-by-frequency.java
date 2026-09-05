class Pair{
    char node;
    int freq;

    Pair(char node, int freq){
        this.node = node;
        this.freq = freq;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.freq, a.freq)
        );

        for(Map.Entry<Character, Integer> entry : map.entrySet()){    
            pq.add(new Pair(entry.getKey(), entry.getValue()));   
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair word = pq.poll();

            for(int i=0; i<word.freq; i++){
                sb.append(word.node);
            }
        }

        return sb.toString();
    }
}