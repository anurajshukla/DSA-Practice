class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> B = new HashMap<Character, Integer>();
        char[] charray = s.toCharArray();
        for(Character ch : charray) {
            if(B.containsKey(ch)) {
                B.put(ch, B.get(ch) + 1);
            }
            else { B.put(ch, 1);
                 }
        }
         for(int i=0; i<s.length();i++){
            if(B.containsKey(s.charAt(i)) && B.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}