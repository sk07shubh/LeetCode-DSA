import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int a = 0;
        int b = nums.length - 1;
        int opr = 0;

        while (a < b) {
            int sum = nums[a] + nums[b];

            if (sum == k) {
                opr++;
                a++;
                b--;
            } else if (sum < k) {
                a++;
            } else {
                b--;
            }
        }

        return opr;
    }
}