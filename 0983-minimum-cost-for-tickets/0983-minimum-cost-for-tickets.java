class Solution {
    public int solve(int i, int[] days, int[] costs, int[] dp){
        int n=days.length;
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];

        int cost1 = costs[0] + solve(i+1, days, costs, dp);

        int maxDay7 = days[i]+7;
        int j=i;
        while(j<n && days[j]<maxDay7){
            j++;
        }
        int cost7 = costs[1] + solve(j, days, costs, dp);

        int maxDay30 = days[i]+30;
        int k=i;
        while(k<n && days[k]<maxDay30){
            k++;
        }
        int cost30 = costs[2] + solve(k, days, costs, dp);

        dp[i] = Math.min(cost1, Math.min(cost7,cost30));
        return dp[i];
    }
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0, days, costs, dp);
    }
}