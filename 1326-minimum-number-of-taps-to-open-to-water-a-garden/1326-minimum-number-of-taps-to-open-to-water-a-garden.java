class Solution {
    public int minTaps(int n, int[] ranges) {
        
        int[][] intervals = new int[n+1][2];
        for(int i=0; i<=n; i++){
            intervals[i][0] = Math.max(0, i - ranges[i]);
            intervals[i][1] = Math.min(n, i + ranges[i]);
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int curr = 0;
        int far = 0;
        int cnt = 0;
        int j=0;
       while(curr < n){
            while(j <= n && intervals[j][0] <= curr){

                far = Math.max(far, intervals[j][1]);
                j++;
            }

            if(curr == far)
            return -1;

            cnt++;
            curr = far;
        }
        return cnt;
    }
}