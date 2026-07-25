class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   // prefix sum 0 first occurs before the array starts

        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else {
                map.put(sum, i);   // store the first occurrence only
            }
        }

        return ans;
    }
}