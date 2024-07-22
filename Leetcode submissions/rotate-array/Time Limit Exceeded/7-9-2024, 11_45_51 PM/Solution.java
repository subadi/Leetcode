// https://leetcode.com/problems/rotate-array

import java.util.Arrays; 
class Solution {
    
    public void rotate(int array[],int n) {
        int len = array.length;
    for (int i = 0; i < n; i++)
      // calling function without passing the number of rotations
      rotateR(array, len);
  }
  public void rotateR(int array[], int n) {
    int i, temp;
    // temporary array to store the newly created array
    temp = array[n - 1];
    for (i = n - 1; i > 0; i--)
      // shifts array element to the left by 1
      array[i] = array[i - 1];
    array[0] = temp;
  }

    // public void rotate(int[] nums, int rotate) {
    //     int rotateCount = 0;
    //     int len = nums.length;
    //     while (rotateCount < rotate) {
    //         int last = nums[len-1];
    //         for (int i = len-1; i >0; i--) {
    //             nums[i] = nums[i-1];
    //         }
    //         nums[0] = last;
    //         rotateCount++;
    //     }

    // }
}