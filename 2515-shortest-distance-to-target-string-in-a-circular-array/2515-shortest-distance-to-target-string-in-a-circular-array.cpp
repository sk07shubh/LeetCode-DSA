class Solution {
public:
    int closestTarget(vector<string>& words, string target, int startIndex) {
        int n = words.size();
        int minD = INT_MAX;

        for(int i=0; i<n; i++){
            if(words[i] == target) {
                int stDis = abs(i - startIndex);
                int cirDis = n - stDis;
                int Dis = min(stDis,cirDis);
                minD = min(minD , Dis);
            }
        }
        if(minD == INT_MAX) return -1;
        else return minD;



        
    }
};