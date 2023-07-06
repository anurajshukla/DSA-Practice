class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int i=0, j=0, sum=0, count=0;
        while(i < nums.length) {
            sum += nums[i];
            while(sum >= target) {
                sum -= nums[j];
                min = Math.min(min, i-j+1);
                j++;
            }
            i++;
        }       
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}