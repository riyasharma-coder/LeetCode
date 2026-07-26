class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> ans = new ArrayList<>();

        int st = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<n; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            if(s<=end){
                st = Math.min(st,s);
                end = Math.max(end,e);
            }else{
                ans.add(new int[]{st,end});
                st = s;
                end = e;
            }
        }
        ans.add(new int[]{st,end});
        
        int[][] num = new int[ans.size()][2];
        for(int i=0; i<ans.size(); i++){
            num[i] = ans.get(i);
        }

        return num ;
    }
}