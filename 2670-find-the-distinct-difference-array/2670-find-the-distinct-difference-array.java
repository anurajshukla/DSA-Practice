class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] diff = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            Set<Integer> p = new HashSet<>();
            Set<Integer> s = new HashSet<>();  
            for(int j=0; j<=i; j++) {
                p.add(nums[j]);
            }
            for(int j=i+1; j<nums.length; j++) {
                s.add(nums[j]);
            }   
            diff[i] = p.size() - s.size();
        }
        return diff;
    }
}