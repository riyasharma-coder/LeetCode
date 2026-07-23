class Solution {
    public boolean solve(int[] weights, int days, int capacity){
        int currLoad = 0;
        int dayNeeded = 1;
        for(int w : weights){
            if(currLoad+w > capacity){
                dayNeeded++;
                currLoad = 0;
            }
            currLoad += w;
        }
        return dayNeeded<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE;
        int high = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<n ; i++){
            sum += weights[i];
            low = Math.max(low, weights[i]);
        }
        high = Math.max(high, sum);

        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(solve(weights, days, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}