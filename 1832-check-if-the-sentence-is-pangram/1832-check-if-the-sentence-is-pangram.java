class Solution {
    public boolean checkIfPangram(String sen) {
        int n = sen.length();

        if(n<26) return false;
        boolean[] words = new boolean[26];
        for(int i=0; i<n;i++){
            words[sen.charAt(i)-'a']=true;
        }

        for(int i=0; i<26; i++){
            if(words[i] == false){
                return false;
            }
        }
        return true;
    }
}