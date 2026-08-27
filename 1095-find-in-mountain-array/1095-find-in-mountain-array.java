/**
 * // This is mountainArr's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface mountainArr {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;

        while( left < right ){
            int mid = left + (right - left)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        int peak = left;

        left = 0;
        right = peak;
        int firstOcc = mountainArr.length();
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mountainArr.get(mid) == target){
                firstOcc = mid;
                break;
            }else if(mountainArr.get(mid) < target){
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        left = peak + 1;
        right = mountainArr.length() - 1;
        int SecOcc = mountainArr.length();
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mountainArr.get(mid) == target){
                SecOcc = mid;
                break;
            }else if(mountainArr.get(mid) > target){
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        if(firstOcc < SecOcc) return firstOcc;
        
        if(SecOcc < firstOcc) return SecOcc;

        return -1;
        
    }
}