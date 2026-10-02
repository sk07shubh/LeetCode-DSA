class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return lessthan(nums,k) - lessthan(nums,k-1);
    }
      public int lessthan(int[] nums, int goal){

        if(goal < 0) return 0;

        int n = nums.length;
        int l = 0,r =0;
        int oddCount = 0;
        int count = 0;
      
        while(r < n){
            if(nums[r] % 2 != 0){
                oddCount++;
            }

            while( oddCount > goal){
                if(nums[l] % 2 != 0) oddCount--;
                l++;
            }

            count += r - l + 1;
            r++;
        }

        return count;
    }
  
    
}