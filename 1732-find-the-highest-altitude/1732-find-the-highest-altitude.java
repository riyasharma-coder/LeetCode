class Solution {
    public int largestAltitude(int[] gain) {
        int n= gain.length;

        int pre = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            pre = pre + gain[i];
            maxi = Math.max(maxi, pre);
        }
        return maxi<0?0:maxi;
    }
}