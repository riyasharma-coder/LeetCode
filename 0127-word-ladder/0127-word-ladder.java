class Solution {
    
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        int n = beginWord.length();
        int m = endWord.length();

        if(n!=m) return 0;
        
        int count = 1;

        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;

        set.remove(beginWord);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int k = 0; k < size; k++) {
                String word = q.poll();

                for (int i = 0; i < word.length(); i++) {
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        StringBuilder sb = new StringBuilder(word);
                        sb.setCharAt(i, ch);
                        String str = sb.toString();
                        if (word.charAt(i) == ch) {
                            continue;
                        }
                        if(str.equals(endWord)){
                            return count + 1;
                        }else{
                            if(set.contains(str)){
                                q.add(str);
                                set.remove(str);
                            }
                        }
                    }
                }
            }

            count++;
        }
        return 0;
    }
}