class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<m; i++){
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
                if(map.get(t.charAt(i))==0){
                    map.remove(t.charAt(i));
                }
            }
        }

        if(map.size()!=0) return false;
        return true;
    }
}