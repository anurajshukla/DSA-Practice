class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Map.Entry<String, Integer>> max = new PriorityQueue<>(
            (a,b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) :a.getValue() - b.getValue()
        );
        
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            max.offer(entry);
            if(max.size()> k) max.poll();
        }

        while(!max.isEmpty()){
            list.add(0, max.poll().getKey());
        }
        return list;
    }
}