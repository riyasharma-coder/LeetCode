class Solution {
    public boolean check(int[] nums) {
        
        //1. brute force by taking all possible rotation of nums

        //2. if (sorted[i] == nums[i+rotation]) return true;

        //3. peak val method

        int n = nums.length;
        int peak = 0;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                peak++;
            }
        }
        if(peak<2){
            return true;
        }
        return false;
    }
}