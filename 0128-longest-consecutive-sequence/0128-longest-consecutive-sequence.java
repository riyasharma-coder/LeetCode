class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        int maxLen = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int len = 1;

                while(set.contains(curr+1)){
                    len += 1;
                    curr += 1;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}