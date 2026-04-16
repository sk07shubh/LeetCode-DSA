class Solution {
public:
    vector<int> solveQueries(vector<int>& nums, vector<int>& queries) {
        int n = nums.size();
        unordered_map<int,vector<int>> indices;

        for(int i=0; i<n; i++){        
            indices[nums[i]].push_back(i);
        }
        
        vector<int>ans;

        for(int &q : queries){
            int minD = INT_MAX;

            vector<int> &idx = indices[nums[q]];

            int sz = idx.size();
            if(idx.size() == 1) {
                ans.push_back(-1);
                continue;
            }

            int pos = lower_bound(idx.begin(), idx.end(), q) - begin(idx);           

            int right = idx[(pos + 1) % sz];
            int stDis = abs( q - right);
            int cirDis = n - stDis;
            int Dis = min(stDis,cirDis);
            minD = min(minD,Dis);

            int left = idx[(pos -1 + sz) % sz];
            stDis = abs( q - left);
            cirDis = n - stDis;
            Dis = min(stDis,cirDis);
            minD = min(minD,Dis);

            if(minD == INT_MAX ){
                ans.push_back(-1);
            }else{
                ans.push_back(minD);
            }
        }
        return ans;
    }
};