class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        return n!=set.size();
    }
}