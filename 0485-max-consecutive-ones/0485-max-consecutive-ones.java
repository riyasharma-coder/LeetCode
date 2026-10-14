class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int cnt = 0;
        int ones = 0;
        int zero = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                ones++;
                cnt = Math.max(ones, cnt);
            }else{
                zero++;
                ones = 0;
            }
        }
        return cnt;
    }
}