class Solution {
    public int videoStitching(int[][] clips, int time) {
        int n = clips.length;
        Arrays.sort(clips, (a, b) -> Integer.compare(a[0], b[0]));

        int far = 0;
        int count = 0;
        int curr = 0;
        int i=0;

        while(curr<time){
            
            while(i<n && clips[i][0]<=curr){
                far = Math.max(far, clips[i][1]);
                i++;
            }

            if(far == curr){
                return -1;
            }
            count++;
            curr = far;

        }

        return count;
    }
}