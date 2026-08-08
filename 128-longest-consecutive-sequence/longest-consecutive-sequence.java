class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0; // handling edge case  
        int count=1;
        int maxcount=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]) continue; // handles duplicates 
            else if((nums[i]+1)== nums[i+1]){ // comparing consecutive elements
                count++;
            }
            else{
                count=1; // reset count if consecutive elements does not found
            }
            maxcount = Math.max(count, maxcount); // counting the max length
        }
        return maxcount;
        
    }
}