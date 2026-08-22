class Solution {
    public String reverseWords(String s) {
        s = s.trim();

        String[] token = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for(int i=token.length-1; i>=0; i--){
            sb.append(token[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}