class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int a = 0;
        int b = n-1;
        int[] ans = new int[n];
        int idx = n-1;

        while(a <= b){
            if(Math.abs(nums[a]) >= Math.abs(nums[b])){
                ans[idx] = nums[a] * nums[a];
                idx--;
                a++;
            }else if(Math.abs(nums[b]) > Math.abs(nums[a])){
                ans[idx] = nums[b] * nums[b];
                idx--;
                b--;
            }
            
            
        }
        return ans;
    }
}