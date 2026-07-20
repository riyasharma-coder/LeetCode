class Solution {
    public boolean isPal(int i, int j, String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void solve(int idx, List<String> op, List<List<String>> ans, String s){
        if(idx==s.length()){
            ans.add(new ArrayList<>(op));
            return;
        }

        for(int i=idx; i<s.length(); i++){
            if(isPal(idx, i,s)){
                op.add(s.substring(idx,i+1));
                solve(i+1, op, ans, s);
                op.remove(op.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> op = new ArrayList<>();
        solve(0, op, ans, s);
        return ans;
    }
}