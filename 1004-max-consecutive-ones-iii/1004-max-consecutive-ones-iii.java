class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int a = 0;
        int b = 0;
        int zero = 0;
        int oneLen = 0;
        int maxLen = 0;
        while(b<n){
            if(nums[b] == 0){
                zero++;
            }else{
                oneLen++;
            }
            
            maxLen = Math.max(maxLen,oneLen + Math.min(zero,k));
            b++;

            if(zero > k){
                if(nums[a] == 0) zero--;
                else oneLen--;
                a++;
            } 
        }
        return maxLen;
    }
}