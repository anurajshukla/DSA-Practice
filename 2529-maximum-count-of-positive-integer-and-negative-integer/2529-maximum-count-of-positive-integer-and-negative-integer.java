class Solution {
    public int maximumCount(int[] nums) {
        int n=0, p=0;
        for(int i=0; i< nums.length; i++) {
        if(nums[i] < 0) n++;
        else if(nums[i] > 0) p++; 
        else { continue; }
        }
        return Math.max(p,n);
    }
}