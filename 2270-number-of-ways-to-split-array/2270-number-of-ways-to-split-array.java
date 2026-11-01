class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long totSum= 0;
        int nOfWays = 0;
        for(int i=0;i<n;i++){
            totSum += nums[i];
        }
        long LSum = 0;
        for(int i=0;i<n-1;i++){
            LSum += nums[i];
            long RSum = totSum - LSum;
            if(LSum >= RSum){
                nOfWays++;
            }

        }
        return nOfWays;

    }
}