class Solution {

    public int romanToInt(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                count -= map.get(s.charAt(i));
            } else {
                count += map.get(s.charAt(i));
            }
        }

        count += map.get(s.charAt(n - 1));
        return count;
    }
}