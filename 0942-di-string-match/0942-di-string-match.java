class Solution {
    public int[] diStringMatch(String s) {
        int[] perm = new int[s.length()+1];
        int i = 0;
        int j = s.length();
        int idx = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'I'){
                perm[idx] = i++;
            }else{
                perm[idx] = j--;
            }
            idx++;
        }
        perm[s.length()] = i;
        return perm;
    }
}