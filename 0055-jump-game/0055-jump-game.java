class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n==1) return true;

        int i=0;
        int farthest = 0;
        int currPath = 0;
        while(i<n){
            farthest = Math.max(farthest, i + nums[i]);
            if(i==currPath){
                currPath = farthest;
                if(currPath >= n-1){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}