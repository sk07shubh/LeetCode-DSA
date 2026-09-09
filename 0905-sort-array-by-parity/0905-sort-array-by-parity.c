int* sortArrayByParity(int* nums, int numsSize, int* returnSize) {
    int left =0;
    int right =0;
    *returnSize = numsSize;
    while(right<numsSize){
        if(nums[right]%2==0){
            int temp =nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right++;
        }else{
            right++;
        }
    }
    return nums;
}