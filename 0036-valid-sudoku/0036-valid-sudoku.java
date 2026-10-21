class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        //for row
        for(int i=0; i<n; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0; j<n; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])){
                        return false;
                    }else{
                        set.add(board[i][j]);
                    }
                }else{
                    continue;
                }
            }
        }

        //for column
        for(int j=0; j<n; j++){
            HashSet<Character> set2 = new HashSet<>();
            for(int i=0; i<n; i++){
                if(board[i][j] != '.'){
                    if(set2.contains(board[i][j])){
                        return false;
                    }else{
                        set2.add(board[i][j]);
                    }
                }else{
                    continue;
                }
            }
        }

        //for 3x3 grid
        for (int i = 0; i < n; i += 3) {
            for (int j = 0; j < n; j += 3) {
                HashSet<Character> set3 = new HashSet<>();
                for(int s = i; s<i+3; s++){
                    for(int t=j; t<j+3; t++){
                        if(board[s][t] != '.'){
                            if(set3.contains(board[s][t])){
                                return false;
                            }else{
                                set3.add(board[s][t]);
                            }
                        }else{
                            continue;
                        }
                    }
                }
            }
        }

        return true;
    }
}