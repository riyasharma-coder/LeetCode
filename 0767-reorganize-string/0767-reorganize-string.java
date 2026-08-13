class Solution {

    public String reorganizeString(String s) {
        int n = s.length();

        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );

        maxHeap.addAll(freq.entrySet());
        
        if(!maxHeap.isEmpty() && maxHeap.peek().getValue()> (n+1)/2){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        while (maxHeap.size() >= 2) {
            Map.Entry<Character, Integer> first = maxHeap.poll();
            Map.Entry<Character, Integer> second = maxHeap.poll();

            sb.append(first.getKey());
            sb.append(second.getKey());

            first.setValue(first.getValue() - 1);
            second.setValue(second.getValue() - 1);

            if(first.getValue() > 0) maxHeap.add(first);
            if(second.getValue() > 0) maxHeap.add(second);
        }

        if(!maxHeap.isEmpty()){
            sb.append(maxHeap.poll().getKey());
        }

        return sb.toString();
    }
}