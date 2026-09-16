class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int vowels = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))vowels++;
        }
        int maxVowels = vowels;

        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i))) vowels++;
            if(isVowel(s.charAt(i-k))) vowels--;
            maxVowels = Math.max(maxVowels,vowels);
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}