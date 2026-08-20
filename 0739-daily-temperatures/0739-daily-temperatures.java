class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;

        if(n==0) return new int[]{};
        if(n==1) return new int[]{0};

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = st.peek()-i;
            }

            st.push(i);
        }
        return ans;
    }
}