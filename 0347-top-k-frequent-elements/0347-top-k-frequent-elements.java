class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap();
        for(int n : nums) {
            m.put(n, m.getOrDefault(n,0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> m.get(b) - m.get(a));
        pq.addAll(m.keySet());
        int[] result = new int[k];
        for(int i=0; i<k; i++) {
        result[i] = pq.poll();
        } 
        return result;
    }
}