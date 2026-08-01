class Solution {
    public boolean mergeTriplets(int[][] tri, int[] tar) {
        int n = tri.length;
        boolean isA = false;
        boolean isB = false;
        boolean isC = false;

        for(int i=0; i<n; i++){
            if (tri[i][0] > tar[0] || tri[i][1] > tar[1] || tri[i][2] > tar[2]) {
                continue;
            }

            if(tri[i][0]==tar[0]){
                isA = true;
            }
            if(tri[i][1]==tar[1]){
                isB = true;
            }
            if(tri[i][2]==tar[2]){
                isC = true;
            }
        }
        return isA && isB && isC;
    }
}