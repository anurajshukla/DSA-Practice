class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        TreeMap<Integer, Integer> tree = new TreeMap<>(map);
        for(Map.Entry<Integer, Integer> entry : tree.entrySet()) {
            int val = entry.getKey();
            int freq = entry.getValue();
            for(int i=0; i<freq; i++) {
                list.add(val);
            }
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}