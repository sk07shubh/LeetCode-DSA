class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        while(i < n && j < n){  
            if(nums[j] == 0){
                j++;
            }else{
                nums[i++] = nums[j++];
            }
        }
        for(int k=i;k<n;k++){
            nums[k] = 0;
        }

        
    }
}