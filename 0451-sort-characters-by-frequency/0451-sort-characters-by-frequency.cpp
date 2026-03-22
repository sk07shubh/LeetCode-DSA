class Solution {
public:
    string frequencySort(string s) {
        int n = s.length();

        unordered_map<char,int> freq;

        for(char ch : s){
            freq[ch]++;
        }

        sort(s.begin(),s.end(), [&] ( char a , char b){
            return freq[a] > freq[b];
        });

        return s;

        
    }
};