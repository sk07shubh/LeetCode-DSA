class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> ans = {{}};

        for(int num : nums){
            int m = ans.size();
            for(int i=0; i<m; i++){
                vector<int> sub = ans[i];
                sub.push_back(num);
                ans.push_back(sub);
            }
        }
        return ans;
        

        
    }
};