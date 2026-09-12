class Solution {

    private boolean isPalindrome(char[] S, int a, int b) {
        while (a < b) {
            if (S[a] != S[b]) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {

        char[] S = s.toCharArray();

        int a = 0;
        int b = S.length - 1;

        while (a < b) {

            if (S[a] != S[b]) {
                return isPalindrome(S, a + 1, b) || isPalindrome(S, a, b - 1);
            }

            a++;
            b--;
        }

        return true;
    }
}

