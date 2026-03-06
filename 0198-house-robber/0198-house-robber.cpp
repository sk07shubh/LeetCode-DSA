class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();

        int Max_loot_so_far = 0;
        int Max_loot_before = 0;

        for(int i=0 ; i<n ; i++){
            int Curr_loot = max(Max_loot_so_far , Max_loot_before + nums[i]);

            Max_loot_before = Max_loot_so_far;
            Max_loot_so_far = Curr_loot;
        }

        
        return Max_loot_so_far;
        
    }
};