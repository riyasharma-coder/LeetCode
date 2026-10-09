class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        String first = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String sec = strs[i];
            int m = first.length();
            int n = sec.length();
            int size = Math.min(m, n);

            for(int j=0; j<size; j++){
                if(first.charAt(j)==sec.charAt(j)){
                    sb.append(first.charAt(j));
                }else{
                    break;
                }
            }

            first = sb.toString();
            sb.setLength(0);

            if (first.isEmpty()) {
                return "";
            } 
        }
        return first;
    }
}