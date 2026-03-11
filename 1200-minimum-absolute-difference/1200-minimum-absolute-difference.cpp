class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        int n = arr.size();

        sort(begin(arr),end(arr));
        int MinDiff = INT_MAX;

        for(int i=1 ; i<n ; i++){
            int diff = arr[i] - arr[i-1];
            MinDiff = min(MinDiff,diff);            
        }
        vector<vector<int>>result;
        for(int i=1 ; i<n ; i++){
            int difference = arr[i] - arr[i-1]; 
            if(difference == MinDiff){
                result.push_back( { arr[i-1] , arr[i] } );
            }

        }
        return result;
        
    }
};