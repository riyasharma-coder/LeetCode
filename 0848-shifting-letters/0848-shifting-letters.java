class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();

        for(int i=0; i<n; i++){
            shifts[i] = shifts[i]%26;
        }
        
        int[] pre = new int[n];
        pre[n-1] = shifts[n-1];

        for(int i=n-2; i>=0; i--){
            pre[i] = shifts[i] + pre[i+1];
        }

        char[] chars = s.toCharArray();
        for(int i=0; i<n; i++){        
            int pos = (chars[i]-'a' + pre[i])%26;
            shifts[i] = pos;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch = (char)(shifts[i] + 'a');
            sb.append(ch);
        }

        return sb.toString();
    }
}