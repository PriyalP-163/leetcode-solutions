class Solution {
    public int firstMissingPositive(int[] nums) {
        int count=1;
        HashSet<Integer> set = new HashSet<>();
        // adding all values of nums in hashset
        for(int num : nums){
            set.add(num);
        }
        for(int i=0; i<nums.length+1; i++){
            if(!set.contains(count)) // if hashset doesnot conatins the currecct count value (starts from 1) then returnn that smallest positive number
            { 
                return count;
            }
            else {
                count++; // else increase count
            }
        }
        return -1;
    }
}