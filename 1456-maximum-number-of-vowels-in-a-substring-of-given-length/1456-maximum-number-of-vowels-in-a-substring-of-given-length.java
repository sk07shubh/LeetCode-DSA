class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int vowels = 0;
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(s.charAt(i)) != -1) vowels++;
        }
        int maxVowels = vowels;

        for(int i=k;i<n;i++){
            if("aeiou".indexOf(s.charAt(i)) != -1) vowels++;
            if("aeiou".indexOf(s.charAt(i-k)) != -1) vowels--;
            maxVowels = Math.max(maxVowels,vowels);
        }
        return maxVowels;
    }
}