class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        StringBuilder sb = new StringBuilder();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        for(int i=0; i<n; i++){
            sb.append(str[i]);
        }
        if(str[0].equals("0")){
            return "0";
        }
        return sb.toString();
    }
}