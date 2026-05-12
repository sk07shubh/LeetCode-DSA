class Solution {
public:
    int findLucky(vector<int>& arr) {
        int n = arr.size();

        unordered_map<int,int> freq;
        int MaxNum = -1;

        for(int x : arr){
            freq[x]++;
        }
        for(int num : arr){
            if(freq[num] == num) MaxNum = max(MaxNum , num);
        }
        return MaxNum;
    }
};