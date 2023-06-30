class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<size; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > (size / 3)) {
                list.add(m.getKey());
            }
        }

        return list;
    }
}