class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();

        if (n == 1) {
            ans.add(new ArrayList<>(Arrays.asList(strs[0])));
            return ans;
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] freq = new int[26];

            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int x : freq) {
                sb.append(x).append('#');
            }

            String key = sb.toString();
            List<String> list = new ArrayList<>();
            if(!map.containsKey(key)){
                map.put(key, list);
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}