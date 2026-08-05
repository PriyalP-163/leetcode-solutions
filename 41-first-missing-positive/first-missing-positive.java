class Solution {
    public int firstMissingPositive(int[] nums) {
        int count=1;
        HashSet<Integer> set = new HashSet<>();
        // adding all values of nums in hashset
        for(int num : nums){
            set.add(num);
        }
        for(int i=0; i<nums.length+1; i++){ // length of nums+1 because of handling the case when all the smallest elements present so the counter will be increased but not print due to end of loop
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