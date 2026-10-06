class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totSum = 0;
        for(int x : nums){
            totSum += x;
        }

        int n = nums.length;
        int[] ans = new int[n];
        int leftSum = 0;
        
        for(int i = 0 ; i < n ; i++){
            int rightSum = totSum - leftSum - nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}