class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=m;

        if (m == 0) {
            for (int x = 0; x < n; x++) {
                nums1[x] = nums2[x];
            }
            return;
        }

        if(n==0){
            return ;
        }

        while(i<nums1.length && j<n && i<k){
            if(nums1[i]>nums2[j]){
                int p = k;
                while(p>i){
                    nums1[p] = nums1[p-1];
                    p--;
                }
                nums1[i] = nums2[j];
                j++;
                k++;
            }
            i++;
        }
        while(i<nums1.length && j<n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}