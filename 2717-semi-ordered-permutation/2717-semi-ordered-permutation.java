class Solution {
    public int semiOrderedPermutation(int[] nums) {
        if(nums[0] == 1 && nums[nums.length-1] == nums.length) { return 0; }
        int c=0, a=0, b=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) { a = i; }
            if(nums[i] == nums.length) { b = i; } 
        }
        if(a > b) {c = a + (nums.length -b-1) -1; }
        else {c = a + (nums.length -b) - 1;}
        return c;
    }
}