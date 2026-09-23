class Solution {
    public int hammingWeight(int n) {
        // int bit = Integer.bitCount(n);
        // return bit;

        int count = 0;
        while(n!=0){
            count += (n%2);
            n = (n/2);
        }
        return count;
    }
}