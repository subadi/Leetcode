// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int last = digits[digits.length-1];
        int first = 0;
        if(last>=9){
            int i=len-1;
             for(i=len-1;i>=0;i--){
                System.out.println("last: "+digits[i]);
                if(digits[i]>=9){
                    first = digits[i];
                    digits[i]=0;
                }else{
                    System.out.println("here: "+digits[i]);
                    first = digits[i];
                    digits[i]= digits[i]+1;
                    System.out.println("after here: "+digits[i]);
                    return digits;
                }
                System.out.println("first: "+first);
            }
            if(i<0 && first>=9){
              int [] newArr = new int[len+1];
              newArr[0] = 1;
              return newArr;  
            }else{
                return digits;
            }
        }else{
            last = last+1;
            digits[digits.length-1] = last;
        }
        return digits;
    }
}