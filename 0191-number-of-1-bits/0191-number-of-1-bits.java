class Solution {
    public int hammingWeight(int n) {
        int bit = Integer.bitCount(n);
        return bit;
    }
}