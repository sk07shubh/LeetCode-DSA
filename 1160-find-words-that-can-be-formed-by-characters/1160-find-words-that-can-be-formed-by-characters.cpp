class Solution {
public:
    int countCharacters(vector<string>& words, string chars) {
        int n = words.size();

        unordered_map<char,int> freq;

        int length = 0;

        for(char ch : chars){
            freq[ch]++;
        }
        for(string word : words){
            bool valid = true;
            unordered_map<char,int> Temp_freq = freq;

            for(char ch : word){
                if(Temp_freq[ch] > 0){
                    Temp_freq[ch]--;
                }else{
                    valid = false;
                    break;                    
                }
            }
            if(valid){
                length += word.length();
            }
            
        }
        return length;
        
    }
};