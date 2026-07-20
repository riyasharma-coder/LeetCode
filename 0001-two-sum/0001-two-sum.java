class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ans =new int[2];
        int idx = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                ans[idx] = i;
                idx++;
                ans[idx] = map.get(res);

                //return new int[]{i, map.get(res)};
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}