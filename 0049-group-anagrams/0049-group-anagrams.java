import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
           
            int[] freq = new int[26];
            for (int i = 0; i < word.length(); i++) {
                freq[word.charAt(i) - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for (int x : freq){
                sb.append(x).append('#');
            }
            String key = sb.toString();
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        
        return new ArrayList<>(map.values());
    }
}
