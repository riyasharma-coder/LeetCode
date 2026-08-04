class Solution {
    public int maximum69Number (int num) {
        
        String str = String.valueOf(num);
        int n = str.length();

        String s = str.replaceFirst("6", "9");
        return Integer.parseInt(s);
    }
}