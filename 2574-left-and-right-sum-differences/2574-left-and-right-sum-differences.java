class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int left=0, right=0;
            for(int j=0; j<i; j++) {
                left += nums[j];
            }

            for(int k=nums.length-1; k>i; k--) {
                right += nums[k];
            }

            ans[i] = Math.abs(left - right);
        }
        return ans;
    }
}