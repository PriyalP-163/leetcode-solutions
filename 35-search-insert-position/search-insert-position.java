class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length-1;
        // for o(log n) time complexity - using binary search
        // as linear search takes o(n) time and soemtimes fails on large array size
        int left =0;
        int right = n;
        while(left<=right){
            int mid = left +(right-left)/2;
            if (nums[mid]==target){
                return mid;
              
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            else if (target > nums[mid]){
                left = mid+1;
            }
        }
        return left; // if the target is not in the input array, this prints the index to insert the target at correct index
    
    }
}