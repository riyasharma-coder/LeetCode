class Solution {
    public boolean closeStrings(String w1, String w2) {
        int m = w1.length();
        int n = w2.length();

        if(m!=n) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<m; i++){
            map1.put(w1.charAt(i), map1.getOrDefault(w1.charAt(i), 0)+1);
        }

        for(int j=0; j<n; j++){
            map2.put(w2.charAt(j), map2.getOrDefault(w2.charAt(j), 0)+1);
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }
        
        List<Integer> list1 = new ArrayList<>(map1.values());
        List<Integer> list2 = new ArrayList<>(map2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        boolean ans = list1.equals(list2);

        return ans;

    }
}