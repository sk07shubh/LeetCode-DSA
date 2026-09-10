class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int hashcountS = 0;
        int hashcountT = 0;
        while (i >= 0 || j >= 0) {
        while(i >= 0){
            if (s.charAt(i) == '#') {
                hashcountS++;
                i--;
            } else if (hashcountS > 0) {

                i--;
                hashcountS--;

            }
            else break;
        }

        while(j >= 0){
            if (t.charAt(j) == '#') {
                hashcountT++;
                j--;
            } else if (hashcountT > 0) {
                j--;
                hashcountT--;
            }
            else break;
        }
      

            int firstch = i < 0 ?'_':s.charAt(i);
            int secondch = j < 0 ?'_':t.charAt(j);
            if (firstch != secondch) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}