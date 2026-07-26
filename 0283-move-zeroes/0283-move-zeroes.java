class Solution {
    
    public void moveZeroes(int[] nums) {

        int i=0;
        int j=0;
        int n = nums.length;
        for(int k=0; k<n; k++){
            if(nums[k]==0){
                i=k;
                j=k;
                break;
            }
        }

        while(j<n){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

    }
}