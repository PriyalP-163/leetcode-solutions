class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer, Integer> shreyal = new HashMap<>();
        // for(int num : nums){
        //     shreyal.put(num, shreyal.getOrDefault(num,0)+1);
        // }
        // List<Map.Entry<Integer, Integer>> list = new ArrayList<>(shreyal.entrySet());
        //     list.sort(Map.Entry.comparingByValue());

        // int ans[] = new int[k];
        // for(int i=0; i<k; i++){
        //     ans[i] = list.get(list.size() -1-i).getKey();
        // }
        // return ans;    

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        q.addAll(map.entrySet());

        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = q.poll().getKey();
        }
        return ans;
    }
}