class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : map.keySet()) { set.add(map.get(i)); }
        if(set.size() == map.size()) { return true; }
        return false;
    }
}