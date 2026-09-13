class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;

        int preSum = 0;

        for(int i=0;i<n;i++){
            preSum += nums[i];
            nums[i] = preSum;
        }
        return nums;
    }
}