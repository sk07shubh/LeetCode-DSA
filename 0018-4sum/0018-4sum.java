import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k=j+1 , l=n-1;
                while(k<l){

                    long foursum =(long) nums[i] + nums[j];
                    foursum += (long)nums[k];
                    foursum += (long)nums[l];

                    if(foursum == target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && l<n-1 && nums[l] == nums[l+1]) l--; 
                    }else if(foursum < target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}