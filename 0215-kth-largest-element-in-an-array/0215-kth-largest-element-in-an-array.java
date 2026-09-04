class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        for(int i=0; i<n; i++){
            int diff = n-k;
            if(i==diff){
                return nums[i];
            }
        }
        return -1;
    }
}