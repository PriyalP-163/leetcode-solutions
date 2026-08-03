class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. Using hashmap - to store the frequencies of the elements
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }
        // for(int freq: map.values()){
        //     if(freq > 1){
        //         return true;
        //     }
        // }
        // return false;

        // 2. using hashset
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}