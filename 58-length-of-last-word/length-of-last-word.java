class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int count=0;
        // if(n+1==1) return 1;
        while(n>=0 && s.charAt(n)==' '){
            n--;
        }
        while(n>=0 && s.charAt(n)!=' '){
            count++;
            n--;
        }
        return count;
    }
}