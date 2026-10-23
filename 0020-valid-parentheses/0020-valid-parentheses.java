class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        int n = s.length();
        for(int i=0; i<n; i++){
            if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }else if(!st.isEmpty() && s.charAt(i)==']' && st.peek()=='['){
                st.pop();
            }else if(!st.isEmpty() && s.charAt(i)=='}' && st.peek()=='{'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}