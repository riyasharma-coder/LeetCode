class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a,b)-> Integer.compare(a[1],b[1]));

        int far = pairs[0][1];
        int count = 1;

        for(int i=1; i<n; i++){
            if(pairs[i][0]>far){
                count++;
                far = pairs[i][1];
            }
        }
        return count;
    }
}