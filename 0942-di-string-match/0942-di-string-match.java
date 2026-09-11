class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        char[] S = s.toCharArray();
        int[] perm = new int[n+1];
        int min = 0;
        int max = n;
        for(int i=0; i<n; i++){
            if(S[i] == 'I') perm[i] = min++;
            else perm[i] = max--;
        }
        perm[n] = min;
        return perm;
    }
}