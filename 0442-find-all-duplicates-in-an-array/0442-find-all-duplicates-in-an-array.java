class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int i=0;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){

                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            }else{
                i++;
            }
        }

        for(i=0; i<n; i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}