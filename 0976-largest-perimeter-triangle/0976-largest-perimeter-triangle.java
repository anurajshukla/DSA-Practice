class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i =nums.length-1; i>1; i-- ) {
            if(nums[i-1] + nums[i-2] > nums[i]) { 
                int p = nums[i] + nums[i-1] + nums[i-2];
                return p;
            }
        }
        return 0;
    }
}