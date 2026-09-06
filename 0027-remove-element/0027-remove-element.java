class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int j = n-1;

        while(i<=j){
            if(nums[i] != val){
                i++;
                continue;
            }
            if(nums[j] == val){
                j--;
                continue;
            }
            nums[i] = nums[j];

            i++;
            j--;
        }
        return i;

    }
}