class Solution {
    public int solve(int k, int n, int[][] dp){
        if(k==1 ) return n;
        if(n==0 || n==1) return n;

        if(dp[k][n] != -1) return dp[k][n];

        int low = 1;
        int high = n;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;

            int eggbreak = solve(k-1, mid-1, dp);
            int nBreak = solve(k, n-mid, dp);
            int worst = 1 + Math.max(eggbreak, nBreak);

            if(eggbreak>nBreak){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            ans = Math.min(ans, worst);
        }
        return dp[k][n] = ans;
    }
    public int superEggDrop(int k, int n) {
        int[][] dp = new int[k+1][n+1];
        
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return solve(k, n, dp);
    }
}