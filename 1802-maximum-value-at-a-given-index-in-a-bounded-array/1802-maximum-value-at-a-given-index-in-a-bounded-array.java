class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int left = 1;
        int right = maxSum;
        int ans = 0;
        while(left <= right){
           int mid = (left + right )/2;
           long leftel = index;
           long consecNums =Math.min(leftel, mid - 1);
           long dupOne = leftel - consecNums;
           long leftsum = (consecNums * mid) - (consecNums * (consecNums+1)/2) + dupOne;
           long rightel = n - index - 1;
           long consecNumsR = Math.min(rightel , mid-1);
           long dupOneR = rightel - consecNumsR;
           long rightsum = (consecNumsR * mid) - (consecNumsR * (consecNumsR+1)/2) + dupOneR;
           long totalsum = leftsum + rightsum + mid;
            if(totalsum <= maxSum
            ){
               ans = mid; 
               left = mid + 1;
            }
            else
               right = mid - 1;
        }
        return ans;
    }
}