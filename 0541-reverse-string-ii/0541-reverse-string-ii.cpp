class Solution {
public:
    void reverseString(string & s , int i , int j) {
        int n = s.size();
        int start = i;
        int end = j;

        while(start<end){
            swap(s[start],s[end]);
            start++;
            end--;
        }
                
    }
    string reverseStr(string s, int k) {
        int n = s.size();

        for(int i=0 ; i<n; i += (2*k)){
            int j = min(i+k-1,n-1);
            reverseString( s, i , j);            
        }
        return s;

        
    }
};