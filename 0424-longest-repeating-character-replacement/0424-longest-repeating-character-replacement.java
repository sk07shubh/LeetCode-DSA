class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        int[] freq = new int[26];

        int a = 0;
        int b = 0;

        int maxFreq = 0;
        int maxLen = 0;

        while(b < n){

            freq[s.charAt(b) - 'A']++;

            maxFreq = Math.max(maxFreq,freq[s.charAt(b) - 'A']);

            if((b - a + 1) - maxFreq > k){
                freq[s.charAt(a) - 'A']--;
                a++;
            }

            maxLen = Math.max(maxLen, b - a + 1);

            b++;
        }

        return maxLen;
    }
}