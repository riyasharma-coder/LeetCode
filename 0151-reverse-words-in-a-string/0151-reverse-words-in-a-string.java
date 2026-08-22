class Solution { 
    public String reverseWords(String s) { 
        if (s == null || s.length() == 0) {
            return s;
        }
        
        char[] arr = s.toCharArray(); 
        int n = arr.length; 
        
        // 1. Reverse the complete string 
        reverse(arr, 0, n); 
        
        int i = 0; 
        int l = 0, r = 0; 
        
        while (i < n) { 
            // Skip leading spaces or spaces between words
            while (i < n && arr[i] == ' ') {
                i++;
            }
            
            // If we reached the end of the string, break
            if (i == n) {
                break;
            }
            
            // If this is not the first word, append a single space spacer
            if (r > 0) {
                arr[r++] = ' ';
                l = r; // The next reversed word starts after this space
            }
            
            // 2. Copy characters of the current word to the 'r' writer position
            while (i < n && arr[i] != ' ') { 
                arr[r++] = arr[i++]; 
            } 
            
            // 3. Reverse the current word back to its correct reading order
            reverse(arr, l, r); 
        } 
        
        // 4. Return the clean string up to the final written character length
        return new String(arr, 0, r); 
    } 

    // Reverses elements in the range [l, r) where r is EXCLUSIVE
    private void reverse(char[] arr, int l, int r) { 
        r--; // Make r inclusive for the two-pointer swap
        while (l < r) { 
            char temp = arr[l]; 
            arr[l] = arr[r]; 
            arr[r] = temp; 
            l++; 
            r--; 
        } 
    } 
}
