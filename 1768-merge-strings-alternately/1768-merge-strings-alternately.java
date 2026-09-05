class Solution {
public 
    String mergeAlternately(String word1, String word2) {
        int a = 0 , b = 0;
        StringBuilder ans = new StringBuilder();

        while(a != word1.length() && b != word2.length()){
            ans.append(word1.charAt(a++));
            ans.append(word2.charAt(b++));
        }

            while(a < word1.length()){
                ans.append(word1.charAt(a++));
            }
    

            while(b < word2.length()){
                ans.append(word2.charAt(b++));
            }
    
        return ans.toString();
        
    }
};