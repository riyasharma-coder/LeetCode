class Solution {
    
    public int trailingZeroes(int n) {
        
        int count =0;
        while(n>=5){
            int res = n/5;
            count += res;
            n = res;
        }
        return count;
    }
}