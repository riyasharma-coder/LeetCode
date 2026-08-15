class Solution {
    public boolean solve(int[] piles, int h, int hrs){

        long sum = 0;
        for(int pile : piles){
            sum += (pile + hrs -1)/hrs;
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int pile: piles){
            high = Math.max(pile, high);
            low = Math.min(pile, low);
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