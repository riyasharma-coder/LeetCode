class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int t) {
        int n = flowerbed.length;

        if (n == 1) {
            if (flowerbed[0] == 0) {
                t--;
            }
            return t <= 0;
        }

        if(flowerbed[0]==0){
            if(flowerbed[1]!=1){
                flowerbed[0] = 1;
                t--;
            }
        }
        for(int i=1; i<n-1; i++){
            if(flowerbed[i]==0){
                if(flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                    flowerbed[i]=1;
                    t--;
                }
            }
        }
        if(flowerbed[n-1]==0){
            if(flowerbed[n-2]!=1){
                flowerbed[n-1] = 1;
                t--;
            }
        }
        return t<=0;
    }
}