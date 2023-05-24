class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> m = new HashMap<>();
        char a = 'a';
        for(char c : key.toCharArray()) {
            if(c!=' ' && !m.containsKey(c)) {
                m.put(c, a);
                a+=1;
            }
        }
        String ans="";
        for(char c : message.toCharArray()) {
            if(c != ' ') { 
            ans+= m.get(c);
            }
            else {
                ans += " ";
            }
        }
        return ans;
    }
}