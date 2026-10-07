class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("\\W", "");
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        String strs = str.toLowerCase();

        int n = strs.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(strs.charAt(i) != strs.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}