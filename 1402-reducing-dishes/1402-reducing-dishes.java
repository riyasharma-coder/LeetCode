import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] satis) {
        Arrays.sort(satis);
        
        int n = satis.length;
        int totalSatisfaction = 0;
        int currentSum = 0;
    
        for (int i = n - 1; i >= 0; i--) {
    
            currentSum += satis[i];
         
            if (currentSum < 0) {
                break;
            }
         
            totalSatisfaction += currentSum;
        }
        
        return totalSatisfaction;
    }
}
