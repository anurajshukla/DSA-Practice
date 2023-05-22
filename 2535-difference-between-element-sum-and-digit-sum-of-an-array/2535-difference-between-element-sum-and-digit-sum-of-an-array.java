class Solution {
    public int differenceOfSum(int[] nums) {
        int esum =0, dsum =0;
        for(int i=0; i<nums.length; i++) {
            esum += nums[i];
            int d = 0;
            while(nums[i] !=0) {
                d = nums[i]%10;
                dsum += d;
                nums[i]/=10;
            }
        }
        return Math.abs(esum - dsum);
    }
}