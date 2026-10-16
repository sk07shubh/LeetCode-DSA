class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0,minSum=0,maxSum=0;

        for(int x:nums){
            sum+=x;
            maxSum=Math.max(maxSum,sum);
            minSum=Math.min(minSum,sum);
        }

        return maxSum-minSum;
    }
}