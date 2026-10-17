class Solution {
    public int GCD(int a, int b){
        while(a!=0){
            int temp = b % a;
            b = a;
            a = temp;
            GCD(a, b);
        }
        return b;
    }
    public String gcdOfStrings(String str1, String str2) {
        
        int m = str1.length();
        int n = str2.length();

        String s1 = str1 + str2;
        String s2 = str2 + str1;

        if(!s1.equals(s2)) return "";

        int size = GCD(m,n);
        return str1.substring(0,size);

    }
}