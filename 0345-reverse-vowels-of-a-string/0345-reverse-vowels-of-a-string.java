class Solution {
    public String reverseVowels(String s) {
        char[] S = s.toCharArray();
        int n = S.length;
        int a = 0;
        int b = n -1;

        while(a < b){
            if("aeiouAEIOU".indexOf(S[a]) == -1){
                a++;
                continue;
            }
            if("aeiouAEIOU".indexOf(S[b]) == -1){
                b--;
                continue;
            }
            char temp = S[a];
            S[a] = S[b];
            S[b] = temp;
            a++;
            b--;
        
        }
        return new String(S);
    }
}