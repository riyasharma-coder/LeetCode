class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i=0;
        int j=0;
        
        StringBuilder sb = new StringBuilder();
        while(j<n){
            if(chars[i]!=chars[j]){
                sb.append(chars[i]);
                int len = j-i;
                if(len > 1){
                    sb.append(len);
                }
                i = j;
            }else{
                j++;
            }
        }
        sb.append(chars[i]);
        int len = j-i;
        if(len > 1){
            sb.append(len);
        }

        for (int k = 0; k < sb.length(); k++) {
            chars[k] = sb.charAt(k);
        }
        
        return sb.length();
    }
}