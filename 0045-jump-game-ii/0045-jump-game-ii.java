class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1 && nums[0]==0){
            return 0;
        }
        if(n==1){
            return 0;
        }

        int i=0;
        int farthest = 0;
        int currPath = 0;
        int count = 0;
        while(i<n){
            farthest = Math.max(farthest, i + nums[i]);
            if(i==currPath){
                currPath = farthest;
                count ++;
                if(currPath >= n-1){
                    return count;
                }
            }
            i++;
        }
        return -1;
    }
}