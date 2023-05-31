class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        Map<Integer, Integer> a = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(a.containsKey(nums[i] - k)) { 
                count+= a.get(nums[i] - k); 
            }
            if(a.containsKey(nums[i] + k)) { 
                count+= a.get(nums[i] + k); 
            }
            a.put(nums[i], a.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
}