class Solution {
public:
    string frequencySort(string s) {
        int n = s.length();

        unordered_map<char,int> freq;

        string ans = "";

        for(char ch : s ){
            freq[ch]++;
        }
        
        priority_queue<pair<int,char>> pq; 
        for(auto [ch,Freq] : freq){
            pq.push({Freq,ch});

            
        }
        while(!pq.empty()){
            auto [freq,ch] = pq.top();
            ans += string(freq,ch);
            pq.pop();
        }
        return ans;


        
    }
};