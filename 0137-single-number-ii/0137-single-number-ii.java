class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int k=0; k<=31; k++){
            int temp = (1<<k);
            int countOne=0;
            int countZeroes=0;

            for(int num : nums){
                if((num & temp)==0){
                    countZeroes++;
                }else{
                    countOne++;
                }
            }
            if(countOne%3==1){
                res = (res|temp);
            }
        }
        return res;
    }
}