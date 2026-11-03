class Solution{
    public int subarraysDivByK(int[] nums,int k){
        int[] freq=new int[k];
        freq[0]=1;
        int sum=0,count=0;

        for(int num:nums){
            sum=Math.floorMod(sum+num,k);
            count+=freq[sum];
            freq[sum]++;
        }

        return count;
    }
}