class Solution {
public:
    int findMiddleIndex(vector<int>& nums) {
        int n = nums.size();

        int Sum = 0;
        for(int x : nums) Sum += x;

        int preSum = 0;

        for(int i=0; i<n; i++){
             
            int rightSum = (Sum - preSum) - nums[i];
            if(preSum == rightSum ) return i;
            preSum += nums[i];


        }
        return -1;
        
    }
};