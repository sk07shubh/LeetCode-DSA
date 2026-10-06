class Solution {
    public int maxScore(String s) {
       int n = s.length();
       int[] onesCount = new int[n];
       
        if(s.charAt(n-1) == '1'){
            onesCount[n-1]  = 1;
        }
       for(int i = n-2  ; i>= 0 ; i--){
        if(s.charAt(i) == '1'){
            onesCount[i] = onesCount[i+1] + 1;
        }else{
            onesCount[i] = onesCount[i+1] ;
        }
       }
        int zeroCount = 0;

        if(s.charAt(0) == '0'){
            zeroCount = 1;
        }

        int maxScore = 0;

        for (int i = 1; i < n; i++) {
            int score = zeroCount + onesCount[i];
            maxScore = Math.max(maxScore,score);
            if(s.charAt(i) == '0'){
                zeroCount++;
            }
        }


            return maxScore;
    }
}