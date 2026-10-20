class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        int n = deck.length;
        if(n<2) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(deck[i], map.getOrDefault(deck[i], 0)+1);
        }

        for (int x = 2; x <= n; x++) {
            boolean valid = true;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int num = entry.getValue();

                if (num % x != 0) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false;
    }
}