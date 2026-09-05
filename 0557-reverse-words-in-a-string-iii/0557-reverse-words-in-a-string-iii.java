class Solution {
    public void revWords(int a , int b, char[] S){
        while(a < b){
            char temp = S[a];
            S[a] = S[b];
            S[b] = temp;
            a++;
            b--;
        }
    }
    public String reverseWords(String s) {
        char[] S = s.toCharArray();
        int n = s.length();
        int i = 0;
        int j = 0;
        
        while(j < n){
            while(j < n && S[j] != ' '){
                j++;
            }
            revWords(i,j-1,S);
            j++;
            i=j;
        }
        return new String(S);
    }
}