class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;

        int far = points[0][1];
        for(int i=1; i<n; i++){
            if(far<points[i][0]){
                far = points[i][1];
                count++;
            }
        }
        return count;
    }
}