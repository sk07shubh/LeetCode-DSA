class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] arr = answerKey.toCharArray();
        int n = arr.length;
        int a = 0;
        int b = 0;
        int Tcount = 0;
        int Fcount = 0;
        int maxLen = 0;
        while(b<n){
            if(arr[b] == 'T') Tcount++;
            else Fcount++;

            int minTF = Math.min(Tcount,Fcount);

            if(minTF > k){
                if(arr[a] == 'T') Tcount--;
                else Fcount--;
                a++;
            }
            int len = b - a + 1;
            maxLen = Math.max(len,maxLen);
            b++;
        }
        return maxLen;
    }
}