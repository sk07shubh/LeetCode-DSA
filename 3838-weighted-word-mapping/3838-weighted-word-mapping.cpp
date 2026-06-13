class Solution {
public:
    string mapWordWeights(vector<string>& words, vector<int>& weights) {
        int n = words.size();

        unordered_map<int,char> alpha;
        
        for(int i=0; i<26; i++){
            alpha[i] = 'z' - i;
        }
        string ans = "";
        for(auto word : words){
            int weight = 0;
            for(char l : word){
                weight += weights[l - 'a'];
            }
            ans += alpha[weight % 26];        
        }
        return ans;

        

    }
};