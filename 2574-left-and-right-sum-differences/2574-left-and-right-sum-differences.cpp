class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n);

        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < n; i++) {
            rightSum -= nums[i];
            result[i] = abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return result;
    }
};