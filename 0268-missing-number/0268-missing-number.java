class Solution {
    public int missingNumber(int[] nums) {
        int asum =0, csum=0;
        for(int i=0; i<nums.length; i++) {
            asum += nums[i];
        }
        for(int i=1; i<= nums.length; i++) {
            csum +=i;
        }
        return csum - asum;
    }
}