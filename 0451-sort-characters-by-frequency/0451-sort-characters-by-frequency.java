class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        PriorityQueue<Character> max = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        max.addAll(map.keySet());
        
        StringBuilder sb = new StringBuilder();
        while(!max.isEmpty()) {
            char c = max.remove();
            for(int i=0; i<map.get(c); i++) {
                    sb.append(c);
            }
        }
        return sb.toString();
    }
}