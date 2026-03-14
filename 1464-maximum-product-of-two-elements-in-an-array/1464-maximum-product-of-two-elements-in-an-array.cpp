class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n = nums.size();
        int Max1 = 0;
        int Max2 = 0;

        for(int x : nums){
            if(x > Max1){
                Max2 = Max1;
                Max1 = x;
            }else if(x > Max2){
                Max2 = x;
            }
        }


        int MaxP = (Max1 - 1)*(Max2 - 1);
        return MaxP;
    }

};