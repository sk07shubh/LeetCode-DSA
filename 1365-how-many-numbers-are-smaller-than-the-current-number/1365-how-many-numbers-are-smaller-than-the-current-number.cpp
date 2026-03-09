class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {

        int n = nums.size();

        vector<int>sorted = nums;

        sort(begin(sorted),end(sorted));

        unordered_map<int,int> NumSmall;

        for(int i=0 ; i<n ; i++){
            if(NumSmall.find(sorted[i]) == NumSmall.end()){
                NumSmall[sorted[i]] = i;
            }

        }
        vector<int>ans;

        for(auto x : nums){
            ans.push_back(NumSmall[x]);

        }
        return ans;        
                    
    }
};