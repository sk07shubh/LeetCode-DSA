class Solution{
    public int maxNonOverlapping(int[] nums,int target){
        HashSet<Integer> set=new HashSet<>();
        set.add(0);

        int sum=0,count=0;

        for(int num:nums){
            sum+=num;

            if(set.contains(sum-target)){
                count++;
                sum=0;
                set.clear();
                set.add(0);
            }else{
                set.add(sum);
            }
        }

        return count;
    }
}