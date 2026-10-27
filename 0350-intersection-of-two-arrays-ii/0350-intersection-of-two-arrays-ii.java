class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<m; i++){
            if(map.containsKey(nums2[i])){
                ans.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
                if(map.get(nums2[i])==0){
                    map.remove(nums2[i]);
                }
            }
        }
        
        int[] arr = new int[ans.size()];
        
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}