class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        int n = arr.size();

        unordered_map<int,int> freq;
        
        for(int x : arr){
            freq[x]++;
        }

        unordered_set<int> seen;

        for(auto x : freq){
            if(seen.count(x.second)){
                return false;
            }
            seen.insert(x.second);
        }
        return true;

        



        
    }
};