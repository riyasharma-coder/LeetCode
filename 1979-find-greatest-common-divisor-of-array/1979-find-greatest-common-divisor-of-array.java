class Solution {
    public int GCD(int a, int b){
        while(a!=0){
            int temp = b % a;
            b = a;
            a = temp;
            GCD(a, b);
        }
        return b;
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return GCD(min, max);
    }
}