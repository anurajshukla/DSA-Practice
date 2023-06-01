class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> a = new ArrayList<>();
        Map<String, Integer> m1 = new HashMap<>();
        Map<String, Integer> m2 = new HashMap<>();
        
        for(String s : s1.split(" ")) {
            m1.put(s, m1.getOrDefault(s, 0) + 1);
        }
        for(String s : s2.split(" ")) {
            m2.put(s, m2.getOrDefault(s, 0) + 1);
        }
        for(String s : m1.keySet()) {
            if(m1.get(s) == 1 && !m2.containsKey(s)) { a.add(s); } 
        }
        for(String s : m2.keySet()) {
            if(m2.get(s) == 1 && !m1.containsKey(s)) { a.add(s); }
        }
        
        String[] s =new String[a.size()];
        for(int i=0; i<s.length; i++) {
            s[i] = a.get(i);
        }
        return s;
    }
}