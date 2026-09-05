class Solution {
    public String reverseOnlyLetters(String s) {
        char[] S = s.toCharArray();
        int a = 0;
        int b = s.length() -1 ;

        while(a<b){

            if(!Character.isLetter(S[a])){
                a++;
                continue;
            }
            if(!Character.isLetter(S[b])){
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