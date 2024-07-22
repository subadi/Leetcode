// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int []nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i <= nums.length-1; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }
            mpp.put(nums[i], i);
        }
        return ans;
    }

}