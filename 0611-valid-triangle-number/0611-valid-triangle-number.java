class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        
        for(int k=n-1;k>1;k--){
            int a = 0;
            int b = k-1;
            while(a<b){
                if(nums[a] + nums[b] > nums[k]){
                    count += b - a;
                    b--;
                }else{
                    a++;
                }
            }
        }
        return count;
    }
}