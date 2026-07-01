class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int MaxWater = 0;

        int i = 0;
        int j = n-1;

        while(i<j){
            int width = j-i;
            int h = min(height[i],height[j]);
            int area = h * width;

            MaxWater = max(MaxWater , area);

            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }


        }
        return MaxWater;

    }

};