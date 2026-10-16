class Solution {
    public boolean isPrime(int num){
        if(num<2){
            return false;
        }

        int n = (int)Math.sqrt(num);
        for(int i=2; i<=n; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    ans.add(nums[i][j]);
                }
            }
        }
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            ans.add(nums[i][j]);
            i++;
            j--;
        }

        Collections.sort(ans);
        int m = ans.size();
        i = m-1;
        for(i=m-1; i>=0; i--){
            if(isPrime(ans.get(i))){
                return ans.get(i);
            }
        }
        return 0;
    }
}