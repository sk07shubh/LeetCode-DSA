class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount  = 0;

        for(int num : nums){
            if(num == 0) zeroCount++;
            if(num == 1) oneCount++;
            if(num == 2) twoCount++;
        }
        for(int i=0;i<n;i++){
            if(zeroCount > 0){
                nums[i] = 0;
                zeroCount--;
                continue;
            }
            if(oneCount > 0){
                nums[i] = 1;
                oneCount--;
                continue;
            }
            if(twoCount > 0){
                nums[i] = 2;
                twoCount--;
                continue;
            }
        }

    }
}