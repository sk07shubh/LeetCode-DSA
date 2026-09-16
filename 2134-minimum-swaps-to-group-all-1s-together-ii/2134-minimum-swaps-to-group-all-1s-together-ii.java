class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int oneCount = 0;
        for(int x : nums){
            if(x == 1) oneCount++;
        }
        int swaps = 0;
        for(int i=0;i<oneCount;i++){
            if(nums[i] == 0){
                swaps++;
            }
        }
        int minSwaps = swaps;

        int i=1;
        int j=oneCount;
        while(i<n){
            if(nums[j%n] == 0) swaps++;
            if(nums[i-1] == 0) swaps--;
            j++;
            i++;
            minSwaps = Math.min(minSwaps,swaps);
        }
        return minSwaps;
    }
}