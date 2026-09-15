class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int a = 0;
        int b = 2;
        int count = 0;
        while(b<n){
            if(s.charAt(a) == s.charAt(b) || s.charAt(a) == s.charAt(b-1) || s.charAt(b-1) == s.charAt(b)){
                a++;
                b++;
            }else{
                count++;
                a++;
                b++;
            }
        }
        return count;
    }
}