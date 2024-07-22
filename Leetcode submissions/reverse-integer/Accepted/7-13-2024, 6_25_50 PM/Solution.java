// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int num) {
        int reverse = 0;
        while(num!=0){
            int lastDigit = num % 10;
            num = num/10;

        if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; // Overflow for positive numbers
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0; // Overflow for negative numbers
            }
            reverse = (reverse*10)+lastDigit;
            System.out.println(" "+reverse);
        }
        return reverse;
    }   
}