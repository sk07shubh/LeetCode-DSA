class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxN = 0;
        for(int n : nums){
            maxN = Math.max(maxN,n);
        }
        int left = 1;
        int right = maxN;
        while(left<right){
            int mid = left + (right - left)/2;
            int sum = 0;
            
            for(int n : nums){
                if(n%mid != 0){
                    sum += n/mid + 1;
                }else{
                    sum += n/mid;
                }
            }
            if(sum <= threshold){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }
}