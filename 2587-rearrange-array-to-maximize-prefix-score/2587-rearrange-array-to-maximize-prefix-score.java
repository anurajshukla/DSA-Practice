class Solution {
    public int maxScore(int[] nums) {
        long [] prefix = new long[nums.length];
        Arrays.sort(nums);
        int n = nums.length;
        long sum=0;
        for(int i=n-1; i>=0; i--) {
            sum+= nums[i];
            prefix[n-1-i] = sum;
        }
        int max=0;
        for(int i=0; i<n; i++) {
            if(prefix[i] > 0) {
                max++;
            }
        }
        return max;
    }
}