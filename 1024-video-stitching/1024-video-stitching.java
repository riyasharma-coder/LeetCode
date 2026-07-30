class Solution {
    public int videoStitching(int[][] clips, int time) {
        int n = clips.length;

        int count = 0;
        int curr = 0;
        int farthest = 0;
        int i=0;
        Arrays.sort(clips, (a,b)-> a[0]-b[0]);

        while(curr<time){
            while(i<n && clips[i][0]<=curr){
                farthest = Math.max(farthest, clips[i][1]);
                i++;
            }
            if(farthest == curr){
                return -1;
            }
            count++;
            curr = farthest;
        }
        
        return count;
    }
}