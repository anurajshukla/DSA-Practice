class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> a = new HashMap<>();
        a.put('I', 1);
        a.put('V', 5);
        a.put('X', 10);
        a.put('L', 50);
        a.put('C', 100);
        a.put('D', 500);
        a.put('M', 1000);
        
        int r = a.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0; i--) {
            if(a.get(s.charAt(i)) < a.get(s.charAt(i+1))){
                r -= a.get(s.charAt(i)); }
               else {r += a.get(s.charAt(i)); }
        }
        return r;
    }
}