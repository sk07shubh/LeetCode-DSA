class Solution {
    public boolean isPalindrome(String s) {
        int a = 0;
        int b = s.length() - 1;
        char[] S = s.toCharArray();
        while(a < b){
            if(!Character.isLetterOrDigit(S[a])){
                a++;
                continue;
            }
            if(!Character.isLetterOrDigit(S[b])){
                b--;
                continue;
            }
            if (Character.toLowerCase(S[a]) != Character.toLowerCase(S[b])) {
                return false;
            } 
            a++;
            b--;
        }
        return true;
    }
}