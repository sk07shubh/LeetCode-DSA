class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] RProd = new int[n];
        int rightProd = 1;
        for(int i=n-1;i>=0;i--){
            rightProd *= nums[i];
            RProd[i] = rightProd;
        }
        int[] ans = new int[n];
        int leftProd = 1;
        ans[0] = RProd[1];
        for(int i=1;i<n-1;i++){
            leftProd *= nums[i-1];
            ans[i] = leftProd * RProd[i+1];
        }
        ans[n-1] = leftProd * nums[n-2];
        return ans;
    }
}