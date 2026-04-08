class Solution {
public:
    int M = 1e9 + 7;
    int xorAfterQueries(vector<int>& nums, vector<vector<int>>& queries){
        int n = nums.size();
        
        
        for(auto &q : queries){
            int idx = q[0];
            while(idx <= q[1]){
                nums[idx] = (1LL * nums[idx] * q[3]) % M;
                idx += q[2];

            }
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            ans ^= nums[i];
        }
        return ans;
        
    }
};