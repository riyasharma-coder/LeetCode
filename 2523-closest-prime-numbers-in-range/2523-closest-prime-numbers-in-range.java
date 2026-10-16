class Solution {
    public int[] closestPrimes(int left, int right) {
        
        int[] isPrime = new int[right+2];
        for(int i=2 ; i<=right; i++){
           isPrime[i] = 1;
        }

        for(int i=2; i<=right; i++){
            if(isPrime[i]==1){
                int j = 2;
                while(j <= right/i){
                    isPrime[i*j]=0;
                    j++;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if( isPrime[i]==1 ){
                list.add(i);
            }
        }

        int j=1;
        int i=0;
        int min = Integer.MAX_VALUE;
        int s = 0;
        int t = 0;
        while(j<list.size()){
            if(min>list.get(j) - list.get(i)){
                min = list.get(j) - list.get(i);
                s=i;
                t=j;
            }
            i++;
            j++;
        }

        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        if(list.size()<2){
            return ans;
        }
        for(int p=0; p<list.size(); p++){
            return new int[]{list.get(s), list.get(t)};
        }

        return ans;
    }
}