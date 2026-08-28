class Solution {
    public int splitArray(int[] nums, int k) {
        int maxEl = 0;
        int sumOEL = 0;
        for(int x : nums){
            maxEl = Math.max(maxEl,x);
            sumOEL += x;
        }
        int left = maxEl;
        int right = sumOEL;
        int ans = -1;
    
        while(left <= right){
            int mid = (left + right)/2;
            int partition = 1;
            int maxSum = mid;
            int CurrSum = 0;
            for( int el : nums){
                if(CurrSum + el <= maxSum){
                    CurrSum += el;
                }else{
                    partition++;
                    CurrSum = el;
                }
            }
            if(partition <= k){
                ans = maxSum;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
            
    }
}