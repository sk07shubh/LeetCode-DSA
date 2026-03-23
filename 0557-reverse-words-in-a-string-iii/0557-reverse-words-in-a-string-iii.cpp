class Solution {
public:

    void reverseString(string & s) {
        int n = s.size();
        int start = 0;
        int end = n-1;

        while(start<end){
            swap(s[start],s[end]);
            start++;
            end--;
        }
                
    }
    string reverseWords(string s) {
        int n = s.length();

        string ans = "";


        for(int i = 0; i<n ; i++){
            string word = "";
            while(i < n && s[i] != ' '){
                word += s[i];
                i++;
            }
            if(word.length() > 0){
                reverseString(word);
                ans += ' ' + word;
            }

        }
        return ans.substr(1);

        
    }
};