class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOcc = -1;
        int secOcc = -1;

        int left = 0, right = nums.length -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstOcc = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }  
        if(firstOcc == -1) return new int[]{firstOcc,secOcc};

        left = 0;
        right = nums.length -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                secOcc = mid;
                left = mid +1;
            } else if (nums[mid] < target) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }

    return new int[]{firstOcc,secOcc};
        

        
        
        
    }
}