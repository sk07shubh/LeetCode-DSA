class Solution {
public:
    int maxDistance(vector<int>& colors) {
        int n = colors.size();
        int maxDist = 0;

        // Compare with first element
        for(int j = n - 1; j >= 0; j--) {
            if(colors[j] != colors[0]) {
                maxDist = max(maxDist, j - 0);
                break;
            }
        }

        // Compare with last element
        for(int i = 0; i < n; i++) {
            if(colors[i] != colors[n - 1]) {
                maxDist = max(maxDist, (n - 1) - i);
                break;
            }
        }

        return maxDist;
    }
};