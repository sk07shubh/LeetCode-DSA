class Solution {
public:
    vector<vector<int>> result;
    void twoSum(vector<int>&nums,int target ,int a, int b){
        int n = nums.size();
        
        while(a<b){
            if(nums[a] + nums[b] < target ){
                a++;
            }else if(nums[a] + nums[b] > target){
                b--;
            }else{
                while(a<b && nums[a] == nums[a+1]) a++;
                while(a<b && nums[b] == nums[b-1]) b--;
                result.push_back({ -target , nums[a],nums[b]});

                a++;
                b--;
            }
           


        }
    }

    
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();

        if(n<3) return {};

        result.clear();

        sort(begin(nums),end(nums));

        for(int i=0 ; i<n ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int n1 = nums[i];
            int target = -n1;

            twoSum(nums, target , i+1 , n-1);
        }    
        return result;    
    }
};