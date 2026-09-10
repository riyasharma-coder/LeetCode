class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> min = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        Set<Pair<Integer, Integer>> set = new HashSet<>();

        min.add(new int[]{
            nums1[0]+nums2[0], 0, 0
        });

        // Mark (0,0) as already added
        set.add(new Pair<Integer, Integer>(0, 0));

        List<List<Integer>> ans = new ArrayList<>();
        int cnt = 0;

        while(cnt < k && !min.isEmpty()) {

            int[] ele = min.remove();

            int sum = ele[0];
            int i = ele[1];
            int j = ele[2];

            ans.add(Arrays.asList(nums1[i], nums2[j]));

            if(i+1 < nums1.length){

                Pair<Integer, Integer> pair =
                    new Pair<Integer, Integer>(i+1, j);

                if(!set.contains(pair)){

                    min.add(new int[]{
                        nums1[i+1]+nums2[j], i+1, j
                    });

                    set.add(pair);
                }
            }

            if(j+1 < nums2.length){

                Pair<Integer, Integer> pair =
                    new Pair<Integer, Integer>(i, j+1);

                if(!set.contains(pair)){

                    min.add(new int[]{
                        nums1[i]+nums2[j+1], i, j+1
                    });

                    set.add(pair);
                }
            }

            cnt++;
        }

        return ans;
    }
}