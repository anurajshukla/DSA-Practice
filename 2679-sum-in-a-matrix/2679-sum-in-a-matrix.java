class Solution {
    public int matrixSum(int[][] nums) {
        int count=0;
        for(int[] n : nums) { Arrays.sort(n); }
        for(int i=0; i<nums[0].length; i++) {
            int max=0;
            for(int j=0; j<nums.length; j++) {
                max = Math.max(max, nums[j][i]);
            }
            count+=max;
        }
        return count;
    }
}