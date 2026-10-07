class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        //does char exist in set
        //if it does not then simply add into set and increase the count
        //and then i++

        //else if char exist in set then simply remove char present at j index and j++;

        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int count = 0;
        int max = 0;
        while(i<n){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            
            set.add(ch);
            count = i-j+1;
            max = Math.max(max, count);
            i++;
        }
        return max;
    }
}