class Solution {
    public int minimizeArrayValue(int[] nums) {
        double minmax = 0, Sum=0;
        for(int i=0; i<nums.length; i++) {
            Sum += nums[i];
            double average = Math.ceil(Sum/(i+1));
            minmax = Math.max(minmax, average);
        }
        return (int) minmax;
    }
}