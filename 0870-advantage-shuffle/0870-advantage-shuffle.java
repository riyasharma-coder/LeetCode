class Solution {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] intervals = new int[m][2];
        for(int i=0; i<nums2.length; i++){
           intervals[i][0] = nums2[i];
           intervals[i][1] = i;
        }

        Arrays.sort(nums1);
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = n-1;
        int[] ans = new int[n];

        for(int i=n-1; i>=0; i--){
            if(nums1[right]>intervals[i][0]){
                ans[intervals[i][1]] = nums1[right];
                right--;
            }else{
                ans[intervals[i][1]] = nums1[left];
                left++;
            }
        }
        return ans;

    }
}