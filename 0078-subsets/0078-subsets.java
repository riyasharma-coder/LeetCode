class Solution {
    public void solve(int i, int[] nums, List<List<Integer>> ans, List<Integer> res){
        if(i==nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }

        res.add(nums[i]);
        solve(i+1, nums, ans, res);
        res.remove(res.size()-1);

        solve(i+1, nums, ans, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(0, nums, ans, new ArrayList<>());
        return ans;
    }
}