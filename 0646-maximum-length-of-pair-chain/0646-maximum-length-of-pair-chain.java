class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int curr = 0;
        int cnt =1;

        curr = pairs[0][1];
        for(int i=1; i<n; i++){
            if(pairs[i][0]>curr){
                cnt++;
                curr = pairs[i][1];
            }
        }
        return cnt;
    }
}