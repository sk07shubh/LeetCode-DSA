class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        

        sort(strs.begin(),strs.end());

        string str1 = strs[0];
        string str2 = strs[strs.size() -  1];

        int idx = 0;

        string str = "";

        while(idx < str1.length() && idx < str2.length() ){
            if(str1[idx] == str2[idx]){
                str += str1[idx];
            }else{
                break;
            }
            idx++;
        }
        return str;


        
    }
};