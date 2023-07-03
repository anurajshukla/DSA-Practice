class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        int[] conver = new int[n];
        long[] ans = new long[n];
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            max = Math.max(max, nums[i]);
            conver[i] = nums[i] + max;
            ans[i] = conver[i];
            if(i>0) {
                ans[i] += ans[i-1];
            }
        }
        
        return ans;
    }
}