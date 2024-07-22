// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int num) {
        int reverse = 0;
        boolean neg = false;
        if(num<0){
        num = -num;
        neg = true;
        }
        while(num>0){
            int lastDigit = num % 10;
            num = num/10;

        if (reverse > Integer.MAX_VALUE / 10 ) {
                return 0; // Overflow for positive numbers
            }
            if (reverse < Integer.MIN_VALUE / 10) {
                return 0; // Overflow for negative numbers
            }
            reverse = (reverse*10)+lastDigit;
            System.out.println(" "+reverse);
        }
        if(neg){
            return -reverse;
        }
        return reverse;
    }   
}