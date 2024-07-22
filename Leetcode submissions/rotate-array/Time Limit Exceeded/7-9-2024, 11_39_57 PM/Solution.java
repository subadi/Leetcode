// https://leetcode.com/problems/rotate-array

import java.util.Arrays; 
class Solution {
    public void rotate(int[] nums, int rotate) {
        int rotateCount = 0;
        int len = nums.length;
        while (rotateCount < rotate) {
             int last = nums[len-1];
            for (int i = len-1; i >0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            rotateCount++;
        }

    }
}