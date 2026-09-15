class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;
        for(int x : cardPoints){
            totalSum += x;
        }
        int Sum = 0;
        for(int i=0;i<(n-k);i++){
            Sum += cardPoints[i];
        }
        int minSum = Sum;
        for(int i=n-k;i<n;i++){
            Sum += cardPoints[i];
            Sum -= cardPoints[i - (n-k)];
            minSum = Math.min(Sum,minSum);
        }
        return totalSum - minSum;

    }
}