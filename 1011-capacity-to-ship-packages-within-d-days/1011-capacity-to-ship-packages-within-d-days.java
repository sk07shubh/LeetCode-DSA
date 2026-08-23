class Solution {
    public boolean canShip(int[] weights, int mid , int days){
        int actualDays = 1;
        int weight = 0;
        
        for(int w : weights){
            if((weight + w) <= mid){
                weight += w;
            }else{
                actualDays++;
                weight = w;
            }
        }
        return actualDays <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maxWght = 0;
        int sumOfwght = 0;
        for(int w : weights){
            sumOfwght += w;
            maxWght = Math.max(maxWght,w);
        }

        int left = maxWght;
        int right = sumOfwght;
        while(left<right){
            int mid = left + (right - left)/2;
            if(canShip(weights, mid , days)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
        
    }
} 