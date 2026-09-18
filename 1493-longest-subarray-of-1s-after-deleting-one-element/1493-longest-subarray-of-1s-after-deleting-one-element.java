class Solution {
    public int longestSubarray(int[] nums) {

        int left = 0;
        int right = 0;
        int n = nums.length;
        int max = 0;
        int zerocount = 0;

        while (right < n) {

            if (nums[right] == 0) {
                zerocount++;
            }

            right++;

            while (zerocount > 1) {
                if (nums[left] == 0) {
                    zerocount--;
                }
                left++;
            }

            max = Math.max(max, right - left - 1);
        }

        return max;
    }
}