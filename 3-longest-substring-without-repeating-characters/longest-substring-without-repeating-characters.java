class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int lngth = 0;
        int left = 0;
        for(int i=0; i<s.length(); i++){
            while(h.contains(s.charAt(i))){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(s.charAt(i));
            lngth = Math.max(lngth, i-left+1);
        }
        return lngth;
    }
}