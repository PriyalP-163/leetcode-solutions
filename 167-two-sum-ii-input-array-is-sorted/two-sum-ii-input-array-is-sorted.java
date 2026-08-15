class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 1. let's try this problem only with two pointers approach
        int left =0;
        int right = numbers.length-1;
        while(left < right){
            int sum = numbers[left]+numbers[right];
            if (sum == target){
                return new int []{left+1, right+1};
            }
            else if (target > sum){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};


        // 2. now let's try this problem using the combination of binary search and Two pointers
        // for(int i=0; i< numbers.length-1; i++){
        //     int required = target - numbers[i];
        //     int left = i+1;
        //     int right = numbers.length-1;
        //     while(left <= right){
        //         int mid = left + (right-left)/2;
        //         if(required == numbers[mid]){
        //             return new int[] {i+1, mid+1};
        //         }
        //         else if (required > numbers[mid]){
        //             left = mid+1;
        //         }
        //         else{
        //             right = mid-1;;
        //         }
        //     }
           
        // }
        //  return new int[]{};
    }
}