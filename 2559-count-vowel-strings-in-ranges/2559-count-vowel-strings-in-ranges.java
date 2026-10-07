class Solution {
    private Boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int m = queries.length;

        int[] prefix = new int[n];
        if(isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length()-1))){
            prefix[0] = 1;
        }
        for(int i=1;i<n;i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
                prefix[i] = prefix[i-1] + 1;
            }else{
                prefix[i] = prefix[i-1];
            }
        }
        int[] ans = new int[m];
        int idx = 0;
        for(int[] q : queries){
            int start = q[0];
            int end = q[1];

            ans[idx++] = prefix[end] - (start > 0 ? prefix[start-1] : 0);
            
        }
        return ans;
    }
}