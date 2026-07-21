class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;

        
        int pre =0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            pre = pre + nums[i];
            min = Math.min(min, pre);
        }
        return min<0?Math.abs(min)+1:1;
    }
}