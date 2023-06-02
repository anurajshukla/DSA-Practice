class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> s1 = new HashSet<>();
        for(int i=0; i<nums.length;i++) {
            s1.add(nums[i]);
        }
        for(int i=1; i<=nums.length; i++) {
            if(!s1.contains(i)) { return i;}
        }
        return nums.length+1;
    }
}