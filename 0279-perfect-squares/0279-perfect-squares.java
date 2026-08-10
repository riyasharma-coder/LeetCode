class Solution {
    public int numSquares(int n) {
        int W = n;

        int count = (int) Math.sqrt(n);
        int wt[] = new int[count];
        for(int i=0; i<count ; i++){
            wt[i] = (i+1)*(i+1);
        }

        if(W==0 || count==0) return 0;
        
        int[][] dp = new int[count+1][W+1];
        
        for(int i=0; i<count+1; i++){
            dp[i][0] = 0;
        }
        for(int j=1; j<W+1; j++){
            dp[0][j]=Integer.MAX_VALUE;
        }
        
        for(int i=1; i<count+1; i++){
            for(int j=1; j<W+1; j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.min(1 + dp[i][j-wt[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[count][W];
    }
}