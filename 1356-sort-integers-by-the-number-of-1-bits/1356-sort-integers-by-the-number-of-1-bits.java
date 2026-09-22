class Pair {
    int num;
    int bit;

    Pair(int num, int bit) {
        this.num = num;
        this.bit = bit;
    }
}

class Solution {
    public int[] sortByBits(int[] arr) {

        Pair[] arrPair = new Pair[arr.length];

        for(int i = 0; i < arr.length; i++) {

            int bit = Integer.bitCount(arr[i]);

            arrPair[i] = new Pair(arr[i], bit);
        }

        Arrays.sort(arrPair, (a,b)->
            {
                if(a.bit != b.bit) {
                return Integer.compare(a.bit, b.bit);
            }

            return Integer.compare(a.num, b.num);
            }
        );

        int[] ans = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            ans[i] = arrPair[i].num;
        }

        return ans;
    }
}