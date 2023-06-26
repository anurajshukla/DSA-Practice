class Solution {
    Map<Character, Integer> map = new HashMap<>();
    int target;
    public int balancedString(String s) {
        target = s.length()/4;
        int min = s.length();
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        if(isBal()) return 0;
        
        for(int st=0, e=0; e<s.length(); e++) {
            char rem = s.charAt(e);
            map.put(rem, map.getOrDefault(rem, 0) -1);
            
            while(st <= e && isBal()) {
                min = Math.min(min, e-st+1);
                char add = s.charAt(st);
                map.put(add, map.getOrDefault(add, 0)+1);
                st++;
            }
        }
        return min;
    }
    
    public boolean isBal() {
        for(char c : map.keySet()) {
            if(map.get(c) > target) { return false; }
        }
        return true;
    }
}