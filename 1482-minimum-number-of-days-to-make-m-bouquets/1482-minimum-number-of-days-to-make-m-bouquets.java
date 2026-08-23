class Solution {
    public int canMake(int[] bloomDay , int mid , int k){
        int boqtCount = 0;
        int conseqCount = 0;
        for(int day : bloomDay){
            if(day <= mid){
                conseqCount++;
            }else{
                conseqCount = 0;
            }
            if(conseqCount == k){
                boqtCount++;
                conseqCount = 0;
            }

        }
        return boqtCount;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int maxDay = 0;
        for(int x : bloomDay){
            maxDay = Math.max(maxDay,x);
        }

        int left = 0;
        int right = maxDay;
        int minDays = -1;
        
        while(left <= right){
            int mid = left + (right - left)/2;

            if((canMake(bloomDay,mid,k)) >= m){
                minDays = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return minDays;
        
    }
}