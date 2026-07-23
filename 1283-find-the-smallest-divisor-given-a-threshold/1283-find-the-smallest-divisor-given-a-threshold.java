class Solution {
    public boolean solve(int[] nums, int threshold, int mid){
        int sum = 0;

        for(int num : nums){
            sum += Math.ceil((num+mid-1)/mid);
        }
        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = Integer.MIN_VALUE;

        for(int i=0; i<n ; i++){
            high = Math.max(high, nums[i]);
        }

        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(solve(nums, threshold, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}