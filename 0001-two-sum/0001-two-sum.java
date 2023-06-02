class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> a = new HashMap<>();
        int [] sum = new int[2];
        for(int i=0; i<nums.length; i++) {
            if(a.containsKey(target - nums[i])) { 
                sum[0] = i;
                sum[1] = a.get(target - nums[i]);
                break;
            }
            a.put(nums[i], i);
        }
        return sum;
    }
}