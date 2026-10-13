class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int i = 0;
        for (int num : set) {
            nums[i] = num;
            i++;
        }
        
        return set.size();
    }
}