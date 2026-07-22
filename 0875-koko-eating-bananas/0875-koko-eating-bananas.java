class Solution {
    public boolean solve(int[] piles, int h, int bananas){
        int hrs = 0;
        for(int i=0; i<piles.length; i++){
            hrs += Math.ceil((double)piles[i]/bananas);
        }
        return hrs<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0; i<n ; i++){
            high = Math.max(high, piles[i]);
        }

        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(solve(piles, h, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}