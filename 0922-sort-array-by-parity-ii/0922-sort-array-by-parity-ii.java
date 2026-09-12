class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int a = 0;
        int b = 1;
        int idx = 0;

        while(idx < n){
            if(nums[idx] % 2 == 0){
                ans[a] = nums[idx];
                a+=2;
            }else{
                ans[b] = nums[idx];
                b+=2;
            }
            idx++;
        }
        return ans;
    }
}