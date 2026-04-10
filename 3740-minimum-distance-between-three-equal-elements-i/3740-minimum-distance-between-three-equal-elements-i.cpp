class Solution {
public:
    int minimumDistance(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,pair<int,int>>mp;
        int MinD = INT_MAX;

        for(int i=0; i<n; i++){
            int num = nums[i];
            if(mp.count(num)){
                auto &[last2,last1] = mp[num];
                if(last2 != -1){
                    MinD = min(MinD , i - last2);
                }
                last2 = last1;
                last1 = i;         
            }else{
                mp[num] = {-1,i};

            }
        }
        return MinD == INT_MAX ? -1 : 2 * MinD;  
        
    }
};