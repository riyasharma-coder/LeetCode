class Solution {
    public int countCollisions(String s) {
        int count = 0;
        int n = s.length();

        boolean isRight = true;
        boolean isLeft = true;

        int i=0;
        int j=n-1;
        while(i<n && s.charAt(i)=='L') i++;
        while(j>=0 && s.charAt(j)=='R') j--;

        for(int k=i; k<=j ; k++){
            if(s.charAt(k)!='S'){
                count ++;
            }
        }
        return count;
    }
}