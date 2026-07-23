class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        int j=0;
        int sum = 0;
        int count = 0;
        int ans = Integer.MIN_VALUE;

        while(j<n){
            sum += nums[j];
            count++;
            if(count == k){
                ans = Math.max(ans, sum);
                sum -= nums[i];
                i++;
                count -= 1;
            }
            j++;
        }
        return (double)ans/k;
    }
}