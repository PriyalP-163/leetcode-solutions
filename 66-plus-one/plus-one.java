class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length; // length of an array
        for(int i=n-1 ; i>=0; i--){
            if(digits[i] < 9){ // checking condition 
                digits[i]++; // increment last digit
                return digits;
            }
            digits[i]=0; // update first digit (carry forward condition)
        }
        int result[] = new int[n+1]; // new array with size increment by 1 
        result[0] = 1; // updating first digit
        return result;
    }
}