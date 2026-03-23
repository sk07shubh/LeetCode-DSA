class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int n = strs.size();

        unordered_map<string,vector<string>> map;

        for(int i=0; i<n; i++){
            string temp = strs[i];

            sort(temp.begin(),temp.end());

            map[temp].push_back(strs[i]);
        }

        vector<vector<string>> result;

        for(auto words : map){
            result.push_back(words.second);

        }
        
        return result;
    }
};