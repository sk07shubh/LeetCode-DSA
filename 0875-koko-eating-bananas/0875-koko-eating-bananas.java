class Solution {
    public boolean canEat(int[] piles, int mid , int h){
        int actualHrs = 0;
        for(int ban : piles){
            actualHrs += ban/mid;
            if(ban%mid != 0) actualHrs++;
        }
        return actualHrs <= h;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int maxBan = 0;
        for(int x : piles){
            maxBan = Math.max(maxBan,x);
        }
        int left = 1;
        int right = maxBan;

        while(left<right){
            int mid = left + (right - left)/2;
            if(canEat(piles,mid,h)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;

        
    }
}