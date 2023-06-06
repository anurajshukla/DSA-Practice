class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> max = new PriorityQueue<>((a, b) -> {
            int freq = map.get(a) - map.get(b);
            return (freq == 0) ? b-a : freq;
        });
        max.addAll(map.keySet());
        int[] a = new int[nums.length];
        int j=0;
        while(!max.isEmpty()) {
            int n = max.poll();
            int f = map.get(n);
            while(f >0) {
                a[j++] = n;
                f--;
            }
        }
        return a;
    }
}