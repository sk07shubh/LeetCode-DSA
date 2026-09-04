class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int a = 0 , b = 0;
        string ans = "";

        while(a != word1.length() && b != word2.length()){
            ans += word1[a];
            ans += word2[b];
            a++;
            b++;
        }
        if(a < word1.length()){
            while(a != word1.length()){
                ans += word1[a];
                a++;
            }
        }
        if(b < word2.length()){
            while(b != word2.length()){
                ans += word2[b];
                b++;
            }
        }
        return ans;
        
    }
};