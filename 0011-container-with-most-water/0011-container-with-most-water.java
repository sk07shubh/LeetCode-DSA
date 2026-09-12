class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int mostWater = 0;
        int a = 0;
        int b = n-1;
        while(a < b){
            int Height = Math.min(height[a],height[b]);
            int width = b - a;
            int water = Height * width;
            mostWater = Math.max(mostWater,water);
            if(height[a] <= height[b]){
                a++;
            }else{
                b--;
            }
        }
        return mostWater;
        
    }
}