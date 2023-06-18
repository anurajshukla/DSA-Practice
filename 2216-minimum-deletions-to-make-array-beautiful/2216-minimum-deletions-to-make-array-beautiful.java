class Solution {
    public int minDeletion(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length-1; i+=2) {
            if((i-count)%2 == 0 && nums[i] == nums[i+1] ) { count++; i--; }
        }
        if((nums.length - count)%2 == 0) { return count; }
        return count+1;
    }
}