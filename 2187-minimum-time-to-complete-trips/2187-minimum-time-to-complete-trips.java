class Solution {
    public boolean solve(int[] nums, int tTrips, long mid){
        long sum = 0;

        for(long num : nums){
            sum += Math.floor((double)mid/num);
        }
        return sum>=tTrips;
    }
    public long minimumTime(int[] nums, int tTrips) {
        int n = nums.length;
        
        long low = Integer.MAX_VALUE;
        long high = Integer.MAX_VALUE;

        for(int i=0; i<n ; i++){
            low = Math.min(low, nums[i]);
            high = Math.min(high, nums[i]) * tTrips;
        }

        long ans = -1;
        while(low<=high){
            long mid = low + (high-low)/2;

            if(solve(nums, tTrips, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}