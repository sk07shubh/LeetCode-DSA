class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int n = accounts.size();
        int m = accounts[0].size();

        int MaxWealth = 0;
        for(int i=0; i<n; i++){
            int Wealth = 0;
            for(int j=0; j<m; j++){
                Wealth += accounts[i][j];
            }
            MaxWealth = max(MaxWealth,Wealth);
        }
        return MaxWealth;
    }
};