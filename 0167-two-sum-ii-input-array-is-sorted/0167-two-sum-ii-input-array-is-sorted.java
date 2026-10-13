class Solution {
    public int[] twoSum(int[] nums, int tar) {
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        //map.put(0,0);
        for(int i=0; i<n; i++){
            int res = tar - nums[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res), i+1};
            }
            map.put(nums[i], i+1);
        }
        return new int[]{-1,-1};
    }
}