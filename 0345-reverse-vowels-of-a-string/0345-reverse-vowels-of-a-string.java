class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int st=0, e=s.length()-1;
        char[] c = s.toCharArray();
        while(st < e) {
           while(st < e && !set.contains(c[st])) { st++; }
           while(st < e && !set.contains(c[e])) { e--; } 
           char temp = c[st]; 
           c[st++] =  c[e]; 
           c[e--] = temp; 
       }
       return new String(c);   
    }
}
