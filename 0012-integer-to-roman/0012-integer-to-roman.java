class Solution {
    public String intToRoman(int num) {
        String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<13; i++){

            int times = 0;
            if(num!=0){
                times = num/arr[i];
                num = num % arr[i];
            }
            while(times>0){
                sb.append(rom[i]);
                times--;
            }
        }
        return sb.toString();
    }
}