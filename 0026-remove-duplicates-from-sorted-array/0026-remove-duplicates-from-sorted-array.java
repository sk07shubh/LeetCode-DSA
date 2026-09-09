class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        

        while(i < n && j < n){
            if(nums[j-1] == nums[j]){
                j++;
            }else{
                nums[++i] = nums[j];
                j++;
            }
        }
        return i+1;

    }
}