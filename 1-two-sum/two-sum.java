class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Optimized approach - o(n)
        int n = nums.length; // length of an array

        // here HashMap is used to store each number as the key and its index as the value
        HashMap<Integer, Integer> s = new HashMap<>(); 
        for(int i=0; i<n ;i++){

            // the required value needed to reach the target
            int required = target - nums[i];
            if(s.containsKey(required)){
                return new int[]{s.get(required), i};
            }
            s.put(nums[i],i); // store the current number and its index
        }
        return new int[]{};



        // // Naive Approach - o(n2)
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }

        //     }
        // }
        // return new int[]{};

    }
}