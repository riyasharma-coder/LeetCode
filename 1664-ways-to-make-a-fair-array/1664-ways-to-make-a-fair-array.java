class Solution {
    public int waysToMakeFair(int[] nums) {

        int n = nums.length;

        int totalEven = 0;
        int totalOdd = 0;

        // Compute total even and odd sums
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                totalEven += nums[i];
            else
                totalOdd += nums[i];
        }

        int preEven = 0;
        int preOdd = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            int sufEven = totalEven;
            int sufOdd = totalOdd;

            // Remove current element from suffix
            if (i % 2 == 0)
                sufEven -= nums[i];
            else
                sufOdd -= nums[i];

            int evenSum = preEven + sufOdd;
            int oddSum = preOdd + sufEven;

            if (evenSum == oddSum)
                count++;

            if (i % 2 == 0) {
                preEven += nums[i];
                totalEven -= nums[i];
            } else {
                preOdd += nums[i];
                totalOdd -= nums[i];
            }
        }

        return count;
    }
}