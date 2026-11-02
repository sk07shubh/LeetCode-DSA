class Solution {
    public int waysToMakeFair(int[] nums) {
      int n = nums.length;
      int leftEvenSum = 0;
      int leftOddSum = 0;
      int rightEvenSum = 0;
      int rightOddSum = 0;
      int count = 0;

      for(int i=0;i<n;i++){
        if(i %2 == 0){
            rightEvenSum += nums[i];
        }else{
            rightOddSum += nums[i];
        }
      }
      for(int i=0;i<n;i++){
        if(i %2 == 0){
            rightEvenSum -= nums[i];
        }else{
            rightOddSum -= nums[i];
        }
        if(leftEvenSum + rightOddSum == leftOddSum + rightEvenSum){
            count++;
        }
        if(i %2 == 0){
            leftEvenSum += nums[i];
        }else{
            leftOddSum += nums[i];
        }

      }
      return count;

    
    }
}