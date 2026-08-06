class Solution {
    public int solve(int i, String s, int[] dp){
        int n = s.length();

        if(i>=n) return 1;
        if(dp[i]!=-1) return dp[i];
        
        int a = 0;
        int b = 0;
        if(i<n && s.charAt(i)!='0'){
            a = solve(i+1, s, dp);
        }

        if (i < n - 1 &&
                (
                        s.charAt(i) == '1' ||
                        (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')
                )) {

            b = solve(i + 2, s, dp);
        }

        dp[i] = a+b;
        return dp[i];
    }
    public int numDecodings(String s) {
        int n = s.length();
        if(n==1 && s.charAt(0)!='0' ) return 1;
        if(s.charAt(0)=='0') return 0;

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0, s, dp);
    }
}