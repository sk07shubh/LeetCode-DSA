import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        Set<Character> st = new HashSet<>();

        int maxLen = 0;
        int a = 0;
        int b = 0;

        while(b < n){

            if(st.contains(s.charAt(b))){
                st.remove(s.charAt(a));
                a++;
            }else{
                st.add(s.charAt(b));

                maxLen = Math.max(maxLen, b - a + 1);

                b++;
            }
        }

        return maxLen;
    }
}