class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int i=0;
        int j=0;
        double sum = 0;
        double res = 0;
        double max = Double.NEGATIVE_INFINITY;

        while(i<n){
            if(i-j+1 < k){
                sum += nums[i];
            }else if(i-j+1 >= k){
                sum += nums[i];
                res = (double)sum/k;
                max = Math.max(res, max);
                sum -= nums[j];
                j++;
            }
            i++;
        }
        return max;
    }
}