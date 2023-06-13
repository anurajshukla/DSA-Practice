class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] count = new int[nums.length];
        int [] s = Arrays.copyOf(nums, nums.length);
        Arrays.sort(s);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(s[i])) {
                map.put(s[i], i);
            }
        }
        for(int i=0; i<nums.length; i++) {
            count[i] = map.get(nums[i]);
        }
        return count;
    }
}