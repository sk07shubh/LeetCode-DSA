class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int a = 0; 
        int b = 1;

        while (a < n && b < n) {

            while (a < n && nums[a] % 2 == 0) {
                a += 2;
            }
            while (b < n && nums[b] % 2 != 0) {
                b += 2;
            }

            if (a < n && b < n) {
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
            }
        }

        return nums;
    }
}