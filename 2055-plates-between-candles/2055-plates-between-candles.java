class Solution {

    public int[] platesBetweenCandles(String s,int[][] queries) {
        int n = s.length();
        int m = queries.length;
        int[] prefix = new int[n];
        int[] leftCandle = new int[n];
        int[] rightCandle = new int[n];

        int plates = 0;
        int lastCandle = -1;

        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '*'){
                plates++;
            }else{
                lastCandle = i;
            }

            prefix[i] = plates;
            leftCandle[i] = lastCandle;
        }

        lastCandle = -1;

        for(int i = n - 1;i >= 0;i--){
            if(s.charAt(i) == '|'){
                lastCandle = i;
            }

            rightCandle[i] = lastCandle;
        }

        int[] ans = new int[m];

        for(int i = 0;i < m;i++){
            int left = queries[i][0];
            int right = queries[i][1];

            int firstCandle = rightCandle[left];
            int lastCandleInRange = leftCandle[right];

            if(firstCandle != -1 && lastCandleInRange != -1 
               && firstCandle < lastCandleInRange){
                ans[i] = prefix[lastCandleInRange] - prefix[firstCandle];
            }
        }

        return ans;
    }
}