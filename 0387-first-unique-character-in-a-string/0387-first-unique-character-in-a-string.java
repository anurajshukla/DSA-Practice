class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charray = s.toCharArray();
        for(Character ch : charray) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
         for(int i=0; i<s.length();i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}